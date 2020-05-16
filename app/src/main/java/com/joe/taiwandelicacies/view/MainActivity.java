package com.joe.taiwandelicacies.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.joe.taiwandelicacies.adapter.RestaurantListAdapter;
import com.joe.taiwandelicacies.databinding.ActivityMainBinding;
import com.joe.taiwandelicacies.model.InfoFactory;
import com.joe.taiwandelicacies.model.InfoRepository;
import com.joe.taiwandelicacies.model.RestaurantMerchantInfoBean;
import com.joe.taiwandelicacies.util.ProgressDialogUtil;
import com.joe.taiwandelicacies.viewmodel.InfoViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private InfoFactory infoFactory;
    private InfoRepository infoRepository;
    private InfoViewModel infoViewModel;

    private ActivityMainBinding activityMainBinding;

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        //1.先產生資料源Repository
        infoRepository = new InfoRepository();
        //2.把生成的資料源塞進Factory裡面
        infoFactory = new InfoFactory(infoRepository);
        //3.再透過ViewModelProvider將Repository綁定到ViewModel上面
        infoViewModel = new ViewModelProvider(this, infoFactory).get(InfoViewModel.class);

        activityMainBinding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialogUtil.showProgressDialog(MainActivity.this, false);
                //讓View去觀察Viewmodel的變化
                //被觀察者通知觀察者 => observable observe observer
                infoViewModel.CallInfo().observe(MainActivity.this, new Observer<ArrayList<RestaurantMerchantInfoBean>>() {
                    @Override
                    public void onChanged(ArrayList<RestaurantMerchantInfoBean> restaurantMerchantInfoBeans) {
                        Log.i(TAG, "run........");
                        RestaurantListAdapter adapter = new RestaurantListAdapter(MainActivity.this, restaurantMerchantInfoBeans);

                        activityMainBinding.recyclerView.setHasFixedSize(true);
                        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                        activityMainBinding.recyclerView.setAdapter(adapter);

                        ProgressDialogUtil.dismiss();
                    }
                });
            }
        });



    }
}

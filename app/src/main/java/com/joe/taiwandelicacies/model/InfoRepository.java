package com.joe.taiwandelicacies.model;

import com.joe.taiwandelicacies.APIInterface.APIInterface;
import com.joe.taiwandelicacies.APIInterface.RetrofitManager;
import com.joe.taiwandelicacies.listener.OnTaskFinish;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * author: Joe Cheng
 */
public class InfoRepository {
    public void loadInfo(final OnTaskFinish onTaskFinish)
    {
        //資料來源可以是DB或是Webservice
        //如果要寫資料來源，可以先建立個interface(ex. UserRepoInterface)，
        //再寫兩個class去implement這個interface(ex. RemoteRepoClass, LocalRepoClass)

        //Retrofit 2
        APIInterface apiInterface = RetrofitManager.getInstance().getApiInterface();
        Call<UserData> dataCall = apiInterface.getRestaurantInfo();
        dataCall.enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {
                RestaurantBean temp = response.body().getRestaurants();
                RestaurantInfoBean alInfoBeans = temp.getAlInfo();
                ArrayList<RestaurantMerchantInfoBean> alInfo = alInfoBeans.getAlMerchantInfo();
                onTaskFinish.onFinish(alInfo);
            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                onTaskFinish.onError(t.getMessage());
            }
        });
    }
}

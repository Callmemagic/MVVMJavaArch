package com.joe.taiwandelicacies.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joe.taiwandelicacies.model.InfoRepository;
import com.joe.taiwandelicacies.listener.OnTaskFinish;
import com.joe.taiwandelicacies.model.RestaurantMerchantInfoBean;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
//取得Repository提供的資料
public class InfoViewModel extends ViewModel {
    private MutableLiveData<ArrayList<RestaurantMerchantInfoBean>> userInfoLiveData = new MutableLiveData<>();
    private InfoRepository infoRepository;

    public InfoViewModel(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public LiveData<ArrayList<RestaurantMerchantInfoBean>> CallInfo()
    {
        infoRepository.loadInfo(new OnTaskFinish() {
            @Override
            public void onFinish(ArrayList<RestaurantMerchantInfoBean> alRestaurantBean) {
                //資料成功回來了就更新LiveData的資料
                userInfoLiveData.postValue(alRestaurantBean);
            }

            @Override
            public void onError(String errMsg) {
                //如果有error的話再看怎麼處理...
            }
        });
        return userInfoLiveData;
    }
}

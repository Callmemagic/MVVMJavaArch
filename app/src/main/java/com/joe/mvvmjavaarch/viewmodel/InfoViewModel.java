package com.joe.mvvmjavaarch.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joe.mvvmjavaarch.model.InfoRepository;
import com.joe.mvvmjavaarch.listener.OnTaskFinish;
import com.joe.mvvmjavaarch.model.UserData;

/**
 * author: Joe Cheng
 */
//取得Repository提供的資料
public class InfoViewModel extends ViewModel {
    private MutableLiveData<UserData> userInfoLiveData = new MutableLiveData<>();
    private InfoRepository infoRepository;

    public InfoViewModel(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public LiveData<UserData> CallInfo()
    {
        infoRepository.loadInfo(new OnTaskFinish() {
            @Override
            public void onFinish(UserData userData) {
                //資料成功回來了就更新LiveData的資料
                userInfoLiveData.postValue(userData);
            }

            @Override
            public void onError(String errMsg) {
                //如果有error的話再看怎麼處理...
            }
        });
        return userInfoLiveData;
    }
}

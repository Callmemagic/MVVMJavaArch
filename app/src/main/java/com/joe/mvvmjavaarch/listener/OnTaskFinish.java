package com.joe.mvvmjavaarch.listener;

import com.joe.mvvmjavaarch.model.RestaurantMerchantInfoBean;
import com.joe.mvvmjavaarch.model.UserData;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public interface OnTaskFinish {
    void onFinish(ArrayList<RestaurantMerchantInfoBean> alBean);

    void onError(String errMsg);
}

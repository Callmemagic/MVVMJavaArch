package com.joe.taiwandelicacies.listener;

import com.joe.taiwandelicacies.model.RestaurantMerchantInfoBean;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public interface OnTaskFinish {
    void onFinish(ArrayList<RestaurantMerchantInfoBean> alBean);

    void onError(String errMsg);
}

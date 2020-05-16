package com.joe.taiwandelicacies.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public class RestaurantInfoBean {
    @SerializedName("Info")
    private ArrayList<RestaurantMerchantInfoBean> alMerchantInfo;

    public ArrayList<RestaurantMerchantInfoBean> getAlMerchantInfo() {
        return alMerchantInfo;
    }
}

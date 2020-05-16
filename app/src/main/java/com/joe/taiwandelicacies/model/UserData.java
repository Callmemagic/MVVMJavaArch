package com.joe.taiwandelicacies.model;

import com.google.gson.annotations.SerializedName;

/**
 * author: Joe Cheng
 */

//先寫個bean
public class UserData {

    @SerializedName("XML_Head")
    private RestaurantBean beans;

    public RestaurantBean getRestaurants()
    {
        return beans;
    }


}

package com.joe.mvvmjavaarch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

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

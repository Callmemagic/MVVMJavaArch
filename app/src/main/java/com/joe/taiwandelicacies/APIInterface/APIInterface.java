package com.joe.taiwandelicacies.APIInterface;

import com.joe.taiwandelicacies.model.UserData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * author: Joe Cheng
 */

//https://gis.taiwan.net.tw/XMLReleaseALL_public/restaurant_C_f.json
public interface APIInterface {
    //寫所有連線的地方，定義func()，實作交給別人
    @GET("restaurant_C_f.json")
    Call<UserData> getRestaurantInfo();


}

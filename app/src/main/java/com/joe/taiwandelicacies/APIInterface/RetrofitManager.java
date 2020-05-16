package com.joe.taiwandelicacies.APIInterface;

import com.joe.taiwandelicacies.value.ConstantValue;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: Joe Cheng
 */
public class RetrofitManager {

    private static RetrofitManager mInstance = new RetrofitManager();

    private APIInterface apiInterface;

    private RetrofitManager()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantValue.baseUrl)
                .addConverterFactory(GsonConverterFactory.create()) //指定用GSON轉
                .build();

        apiInterface = retrofit.create(APIInterface.class);
    }

    public static RetrofitManager getInstance()
    {
        return mInstance;
    }

    public APIInterface getApiInterface()
    {
        return apiInterface;
    }
}

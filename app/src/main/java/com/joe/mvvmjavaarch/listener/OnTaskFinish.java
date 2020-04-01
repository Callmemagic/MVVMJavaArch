package com.joe.mvvmjavaarch.listener;

import com.joe.mvvmjavaarch.model.UserData;

/**
 * author: Joe Cheng
 */
public interface OnTaskFinish {
    void onFinish(UserData userData);

    void onError(String errMsg);
}

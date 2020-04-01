package com.joe.mvvmjavaarch.model;

import com.joe.mvvmjavaarch.listener.OnTaskFinish;

/**
 * author: Joe Cheng
 */
public class InfoRepository {
    public void loadInfo(OnTaskFinish onTaskFinish)
    {
        //資料來源可以是DB或是Webservice
        //如果要寫資料來源，可以先建立個interface(ex. UserRepoInterface)，
        //再寫兩個class去implement這個interface(ex. RemoteRepoClass, LocalRepoClass)

        //有空的時候，抓公開資料來試試看這個架構可不可行

        UserData userData = new UserData();
        userData.userAge = 24;
        userData.userName = "Joe";
        onTaskFinish.onFinish(userData);
    }
}

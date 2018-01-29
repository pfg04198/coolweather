package com.admin.coolweather.util;

/**
 * Created by Administrator on 2018/1/29.
 */

public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}

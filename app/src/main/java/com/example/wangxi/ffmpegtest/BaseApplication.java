package com.example.wangxi.ffmpegtest;

import android.app.Application;

/**
 * Created by wangxi on 2017/11/10.
 */

public class BaseApplication extends Application {

    public static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }
}

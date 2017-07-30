package com.example.administrator.mycoolweather;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import org.litepal.LitePal;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/7/23 0023.
 */

public class MyApplication extends Application {
    public  static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
        Stetho.initializeWithDefaults(this);
        new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();
    }

    public static Context getContext() {
        return context;
    }
}

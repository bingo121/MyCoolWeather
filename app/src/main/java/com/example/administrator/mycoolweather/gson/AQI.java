package com.example.administrator.mycoolweather.gson;

/**
 * Created by Administrator on 2017/7/29 0029.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

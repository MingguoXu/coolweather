package com.xuzong.coolweather.gson;

/**
 * Created by xuzong on 2019/1/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
        public String qlty;
    }
}

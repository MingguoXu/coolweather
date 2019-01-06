package com.xuzong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuzong on 2019/1/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

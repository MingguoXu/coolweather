package com.xuzong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xuzong on 2019/1/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

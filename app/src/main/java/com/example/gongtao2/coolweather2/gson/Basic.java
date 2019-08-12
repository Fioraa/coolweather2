package com.example.gongtao2.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gong.tao2 on 2019/8/8.
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

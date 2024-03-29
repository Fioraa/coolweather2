package com.example.gongtao2.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gong.tao2 on 2019/8/8.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

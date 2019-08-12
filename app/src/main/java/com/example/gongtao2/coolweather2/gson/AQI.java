package com.example.gongtao2.coolweather2.gson;

import java.security.PublicKey;

/**
 * Created by gong.tao2 on 2019/8/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

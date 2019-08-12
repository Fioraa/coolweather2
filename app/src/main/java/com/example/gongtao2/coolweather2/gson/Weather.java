package com.example.gongtao2.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gong.tao2 on 2019/8/9.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

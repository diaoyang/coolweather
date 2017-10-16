package com.example.coolweather.gson;

/**
 * Created by dy on 2017/10/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

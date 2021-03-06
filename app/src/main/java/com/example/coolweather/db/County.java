package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dy on 2017/10/12.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countryName;
    }
    public void setCountyName(String countryName){
        this.countryName = countryName;
    }

    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}

package com.example.coolweather.andoid.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
    private String countyName;//县名字
    private String weatherId;//所对应的天气
    private int cityId;//当前所属市的id

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getCountyName() {
        return countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public int getCityId() {
        return cityId;
    }
}

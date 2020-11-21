package com.example.coolweather.andoid.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityName;//市名
    private int cityCode;//市代号
    private String provinceId;//所属省份

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceId() {
        return provinceId;
    }
}

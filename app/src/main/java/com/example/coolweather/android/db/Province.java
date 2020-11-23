package com.example.coolweather.android.db;


import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;//每个实体类都应该由的字段
    private String provinceName;//省名字
    private int provinceCode;//省代号

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
}

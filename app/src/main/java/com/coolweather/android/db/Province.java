package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by JeremyTsai on 2019/1/17.
 * CopyRight@ 深医信息技术（深圳）有限公司
 * <p>
 * <p>@describe: 省份</p>
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

package com.sise.service.impl;

import com.sise.dao.CityDao;
import com.sise.entity.City;
import com.sise.service.CityService;

import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 1:10
 */
public class CityServiceImpl implements CityService{
    @Override
    public List<City> getCitiesByProvinceId(int provinceId) {
        return new CityDao().getCitiesByProvinceId(provinceId);
    }
}

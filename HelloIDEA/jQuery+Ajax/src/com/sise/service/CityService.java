package com.sise.service;

import com.sise.entity.City;

import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 1:09
 */
public interface CityService {

    List<City> getCitiesByProvinceId(int provinceId);

}

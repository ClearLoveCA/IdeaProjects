package com.sise.test;

import com.sise.entity.City;
import com.sise.entity.Province;
import com.sise.service.CityService;
import com.sise.service.ProvinceService;
import com.sise.service.impl.CityServiceImpl;
import com.sise.service.impl.ProvinceServiceImpl;

import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 0:42
 */
public class TestCity {
    public static void main(String args[]){
        CityService cityService=new CityServiceImpl();
        List<City> cities=cityService.getCitiesByProvinceId(1);
        for(City city:cities){
            System.out.println(city);
        }
    }
}

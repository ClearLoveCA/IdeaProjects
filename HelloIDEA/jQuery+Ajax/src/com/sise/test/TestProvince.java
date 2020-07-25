package com.sise.test;

import com.sise.entity.Province;
import com.sise.service.ProvinceService;
import com.sise.service.impl.ProvinceServiceImpl;

import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 0:42
 */
public class TestProvince {
    public static void main(String args[]){
        ProvinceService provinceService=new ProvinceServiceImpl();
        List<Province> provinces=provinceService.getAllProvince();
        for(Province province:provinces){
            System.out.println(province);
        }
    }
}

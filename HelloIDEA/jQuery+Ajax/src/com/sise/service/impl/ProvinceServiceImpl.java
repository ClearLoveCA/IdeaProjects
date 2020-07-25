package com.sise.service.impl;

import com.sise.dao.ProvinceDao;
import com.sise.entity.Province;
import com.sise.service.ProvinceService;

import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 0:30
 */
public class ProvinceServiceImpl implements ProvinceService{

    @Override
    public List<Province> getAllProvince() {
        return new ProvinceDao().getAllProvince();
    }
}

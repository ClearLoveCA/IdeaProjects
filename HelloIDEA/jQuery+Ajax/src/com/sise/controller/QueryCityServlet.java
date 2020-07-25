package com.sise.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sise.entity.City;
import com.sise.entity.Province;
import com.sise.service.CityService;
import com.sise.service.ProvinceService;
import com.sise.service.impl.CityServiceImpl;
import com.sise.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 1:03
 */
public class QueryCityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strProId=request.getParameter("proId");
        CityService cityService=new CityServiceImpl();
        List<City> cities=cityService.getCitiesByProvinceId(Integer.valueOf(strProId));
        String json="{}";
        try {
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(cities);
        }catch (Exception e){
            e.printStackTrace();
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }
}

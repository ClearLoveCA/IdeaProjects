package com.sise.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sise.entity.Province;
import com.sise.service.ProvinceService;
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
 * @date 2020-07-25 0:45
 */
public class QueryAllProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProvinceService provinceService=new ProvinceServiceImpl();
        List<Province> provinces=provinceService.getAllProvince();
        String json="{}";
        try {
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(provinces);
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

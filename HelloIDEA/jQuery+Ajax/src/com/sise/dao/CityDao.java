package com.sise.dao;

import com.sise.entity.City;
import com.sise.entity.Province;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 645
 * @date 2020-07-25 1:05
 */
public class CityDao {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String username="root";
    String password="12345";
    String url="jdbc:mysql://localhost:3306/ajax?useUnicode=true&characterEncoding=UTF-8";
    String sql="";

    public List<City> getCitiesByProvinceId(int provinceId){
        List<City> cities=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(url,username,password);
            sql="select * from city where provinceid=?";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,provinceId);
            rs=ps.executeQuery();
            while (rs.next()){
                cities.add(new City(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("provinceid")
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return cities;
    }
}

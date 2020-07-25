package com.sise.entity;

/**
 * @author 645
 * @date 2020-07-25 0:24
 */
public class City {

    Integer id;
    String name;
    Integer provinceId;

    public City() {
    }

    public City(Integer id, String name, Integer provinceId) {
        this.id = id;
        this.name = name;
        this.provinceId = provinceId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }
}

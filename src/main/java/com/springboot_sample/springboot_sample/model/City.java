package com.springboot_sample.springboot_sample.model;

public class City {
    private Integer id = null;
    private String name = null;
    public static Integer autoincrementId = 0;

    City(){

    }

    public City(String name){
        Country.autoincrementId++;
        this.id = Country.autoincrementId;
        this.name = name;
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

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

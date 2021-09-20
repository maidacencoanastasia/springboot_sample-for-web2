package com.springboot_sample.springboot_sample.repository;

public class CityRepository {

    public String create(String cityName){
        return "City created";
    }
    public String read(){
        return "Read City";
    }

    public String update(){
        return "Update City";
    }

    public String delete(){
        return "Delete City";
    }
}

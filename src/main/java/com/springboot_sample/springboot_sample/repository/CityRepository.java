package com.springboot_sample.springboot_sample.repository;

import com.springboot_sample.springboot_sample.model.City;
import com.springboot_sample.springboot_sample.model.Country;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<City> cities = new ArrayList<City>();

    ArrayList<City> countries = new ArrayList<>();
    public CityRepository(){
        }

    public String create(String cityName) {
        City city = new City(cityName);
        this.cities.add(city);
        return "City created";
    }

    public String readAll() {
        return this.cities.toString();
    }

    public String read(Integer id) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return city.toString();
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String update(Integer id, String cityName) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            city.setName(cityName);
            return "Country updated";
        } catch (Exception exception){
            return "Country not found";
        }
    }
    public String delete(Integer id){
    try {
        City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
        if(city == null){
            return "City not found";            }
        this.countries.remove(city);
        return "City deleted";
    } catch (Exception exception){
        return "City not found";
    }

}


}

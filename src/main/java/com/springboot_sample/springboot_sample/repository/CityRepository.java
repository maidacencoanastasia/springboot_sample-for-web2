package com.springboot_sample.springboot_sample.repository;

import com.springboot_sample.springboot_sample.model.City;
import com.springboot_sample.springboot_sample.model.Country;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<City> cities = new ArrayList<>();

    public CityRepository() {
    }

    public String create(String CityName, Integer countryId, String countryName) {
        City city = new City(CityName, countryId, countryName);
        this.cities.add(city);
        return "City created";
    }

    public String readAll() {
        return this.cities.toString();
    }

    public String read(Integer id) {
        try {
            City City = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            assert City != null;
            return City.toString();
        } catch (Exception exception) {
            return "Not found";
        }
    }

    public String update(Integer id, String name, String cityName) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            assert city != null;
            city.setName(cityName);
            return "City updated";
        } catch (Exception exception) {
            return "City not found";
        }
    }

    public String delete(Integer id) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if (city == null) {
                return "City not found";
            }
            this.cities.remove(city);
            return "City deleted";
        } catch (Exception exception) {
            return "City not found";
        }

    }


}

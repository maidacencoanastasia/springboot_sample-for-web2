package com.springboot_sample.springboot_sample.repository;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<String> cities = new ArrayList<>();

    public CityRepository() {
        this.cities.add("Balti");
        this.cities.add("Kiev");
        this.cities.add("Iasi");
        this.cities.add("Stambul");
    }

    public String create(String cityName) {
        this.cities.add(cityName);
        return "City created";
    }

    public String readAll() {
        return this.cities.toString();
    }

    public String read(Integer id) {
        try {
            return id + ":" + this.cities.get(id);
        } catch (Exception exception) {
            return " index can not be found ";
        }
    }

    public String update(Integer id, String cityName) {
        try {
        this.cities.set(id, cityName);
        return "City updated";
        } catch (Exception exception){
            return "City can not be found";
        }
    }

    public String delete(Integer id) {
        try {
            this.cities.remove(this.cities.get(id));
            return "City deleted";
        } catch (Exception exception){
            return "City can not be found";
        }
    }
}

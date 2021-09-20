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
            return " index not found ";
        }
    }

    public String update(Integer id, String cityName) {
        this.cities.set(id, cityName);
        return "Update City";
    }

    public String delete() {
        return "Delete City";
    }
}

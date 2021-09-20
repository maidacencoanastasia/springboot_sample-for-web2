package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.repository.CityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CityRepository cityRepository = new CityRepository();

    @PostMapping("cities")
    public String create(@RequestParam String cityName){
        return cityRepository.create(cityName);
    }
    @GetMapping("cities")
    public String read(){
        return "Read city";
    }
    @PutMapping("cities")
    public String update(){
        return "Update city";
    }
    @DeleteMapping("cities")
    public String delete(){
        return "Delete city";
    }
}

package com.springboot_sample.springboot_sample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @PostMapping("cities")
    public String create(){
        return "Create city";
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

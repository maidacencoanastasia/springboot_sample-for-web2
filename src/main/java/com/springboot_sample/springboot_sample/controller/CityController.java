package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.repository.CityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CityRepository cityRepository = new CityRepository();

    @PostMapping("cities")
    public String create(@RequestParam String cityName) {
        return cityRepository.create(cityName);
    }

    @GetMapping("cities")
    public String readAll() {
        return cityRepository.readAll();
    }

    @GetMapping("cities/{id}")
    public String read(@PathVariable Integer id) {
        return cityRepository.read(id);
    }

    @PutMapping("cities/{id}")
    public String update(@PathVariable Integer id, @RequestParam String cityName) {
        return cityRepository.update(id, cityName);
    }

    @DeleteMapping("cities/{id}")
    public String delete(@PathVariable Integer id) {
        return cityRepository.delete(id);
    }
}

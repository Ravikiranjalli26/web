package com.example.EcomWebsite.Controller;

import com.example.EcomWebsite.Service.CityServices;
import com.example.EcomWebsite.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityServices city;

    @GetMapping("city")
    public List<City> findAll(){
        return city.findAll();
    }
}

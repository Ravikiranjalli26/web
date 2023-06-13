package com.example.EcomWebsite.Service;

import com.example.EcomWebsite.Repository.CityRepository;
import com.example.EcomWebsite.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServices {

    @Autowired
    private CityRepository city;


    public List<City> findAll() {
        return city.findAll();
    }
}

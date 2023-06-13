package com.example.EcomWebsite.Controller;

import com.example.EcomWebsite.Service.ShippmentServices;
import com.example.EcomWebsite.model.Shipments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShippmentController {

    @Autowired
    private ShippmentServices shippment;

    @GetMapping("allshipments")
    public List<Shipments> findAll(){
        return shippment.findAll();
    }
 }

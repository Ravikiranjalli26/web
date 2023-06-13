package com.example.EcomWebsite.Service;

import com.example.EcomWebsite.Repository.ShippmentRepository;
import com.example.EcomWebsite.model.Shipments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippmentServices {

    @Autowired
    private ShippmentRepository shippment;

    public List<Shipments> findAll() {
        return shippment.findAll();
    }
}

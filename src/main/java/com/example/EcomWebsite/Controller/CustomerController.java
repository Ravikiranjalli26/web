package com.example.EcomWebsite.Controller;

import com.example.EcomWebsite.Service.CustomerServices;
import com.example.EcomWebsite.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customer;

    @GetMapping("customer")
    public List<Customers> findAll(){
        return customer.findAll();
    }

}

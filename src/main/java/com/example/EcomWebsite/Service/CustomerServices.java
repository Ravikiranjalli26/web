package com.example.EcomWebsite.Service;

import com.example.EcomWebsite.Repository.CustomerRepository;
import com.example.EcomWebsite.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customer;

    public List<Customers> findAll() {
        return customer.findAll();
    }
}

package com.example.EcomWebsite.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "names")
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "city")
    private List<Customers> customers;

    public City(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.EcomWebsite.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shipments")
public class Shipments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "weights")
    private Integer weight;

    @Column(name = "orders")
    private Integer NoOfOrder;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customers customers;

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Shipments(Long id, Integer weight, Integer noOfOrder) {
        this.id = id;
        this.weight = weight;
        NoOfOrder = noOfOrder;
    }

    public Shipments() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNoOfOrder() {
        return NoOfOrder;
    }

    public void setNoOfOrder(Integer noOfOrder) {
        NoOfOrder = noOfOrder;
    }
}

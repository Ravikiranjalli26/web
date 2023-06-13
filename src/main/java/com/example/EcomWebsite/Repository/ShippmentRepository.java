package com.example.EcomWebsite.Repository;

import com.example.EcomWebsite.model.Shipments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippmentRepository extends JpaRepository<Shipments,Long> {
}

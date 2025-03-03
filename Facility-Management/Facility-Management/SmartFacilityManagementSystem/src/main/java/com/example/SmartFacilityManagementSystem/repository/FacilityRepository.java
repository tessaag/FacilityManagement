package com.example.SmartFacilityManagementSystem.repository;

import com.example.SmartFacilityManagementSystem.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    // Additional custom queries can be defined here
}

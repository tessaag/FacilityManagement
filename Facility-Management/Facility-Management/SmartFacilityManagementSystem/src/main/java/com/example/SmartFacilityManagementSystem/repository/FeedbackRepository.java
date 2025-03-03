package com.example.SmartFacilityManagementSystem.repository;

import com.example.SmartFacilityManagementSystem.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    // Custom queries for feedback can be added as needed
}

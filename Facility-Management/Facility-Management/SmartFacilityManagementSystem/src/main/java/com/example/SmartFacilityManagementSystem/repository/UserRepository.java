package com.example.SmartFacilityManagementSystem.repository;

import com.example.SmartFacilityManagementSystem.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {
    // For authentication
    @Query("SELECT u FROM Users u WHERE u.email = ?1 AND u.password = ?2")
    Optional<Users> validateUser(String email, String password);
}

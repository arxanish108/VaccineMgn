package com.example.VaccineManagement.Repository;

import com.example.VaccineManagement.Models.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

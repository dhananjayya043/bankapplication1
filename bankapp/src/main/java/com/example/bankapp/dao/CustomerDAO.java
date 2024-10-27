package com.example.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

	
    // Additional query methods can be defined here
}
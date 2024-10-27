package com.example.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Long> {
    // You can add query methods specific to Admin here
    Admin findByUsername(String username);

	
}

package com.example.bankapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Long> {

	
    // Additional query methods can be defined here
}
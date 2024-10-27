package com.example.bankapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Transaction;

@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Long> {

	
    // Additional query methods can be defined here
}

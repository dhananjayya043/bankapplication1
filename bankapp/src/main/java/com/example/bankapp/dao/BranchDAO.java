package com.example.bankapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankapp.model.Branch;

@Repository
public interface BranchDAO extends JpaRepository<Branch, Long> {

	
    // Additional query methods can be defined here
}
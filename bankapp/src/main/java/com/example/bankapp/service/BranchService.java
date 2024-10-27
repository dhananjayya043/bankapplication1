package com.example.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.dao.BranchDAO;
import com.example.bankapp.model.Branch;

@Service
public class BranchService {
    @Autowired
    private BranchDAO branchDAO;

    public List<Branch> getAllBranches() {
        return branchDAO.findAll();
    }

    public Branch saveBranch(Branch branch) {
        return branchDAO.save(branch);
    }
}
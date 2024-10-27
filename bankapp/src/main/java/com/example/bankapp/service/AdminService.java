package com.example.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.dao.AdminDAO;
import com.example.bankapp.model.Admin;

@Service
public class AdminService {
    @Autowired
    private AdminDAO adminDAO;

    public Admin saveAdmin(Admin admin) {
        return adminDAO.save(admin);
    }

    public Admin findByUsername(String username) {
        return adminDAO.findByUsername(username);
    }
}
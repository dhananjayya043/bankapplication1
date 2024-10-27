package com.example.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.dao.CustomerDAO;
import com.example.bankapp.model.Customer;

@Service
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public Customer getCustomer(Long id) {
        return customerDAO.findById(id).orElse(null);
    }
}
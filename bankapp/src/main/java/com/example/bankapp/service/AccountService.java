package com.example.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.dao.AccountDAO;
import com.example.bankapp.model.Account;

@Service
public class AccountService {
    @Autowired
    private AccountDAO accountDAO;

    public List<Account> getAllAccounts() {
        return accountDAO.findAll();
    }

    public Account saveAccount(Account account) {
        return accountDAO.save(account);
    }

    public Account getAccount(Long id) {
        return accountDAO.findById(id).orElse(null);
    }
}
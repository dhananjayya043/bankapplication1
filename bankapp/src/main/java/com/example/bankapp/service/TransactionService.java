package com.example.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankapp.dao.TransactionDAO;
import com.example.bankapp.model.Transaction;

@Service
public class TransactionService {
    @Autowired
    private TransactionDAO transactionDAO;

    public List<Transaction> getAllTransactions() {
        return transactionDAO.findAll();
    }

    public Transaction saveTransaction(Transaction transaction) {
        return transactionDAO.save(transaction);
    }
}
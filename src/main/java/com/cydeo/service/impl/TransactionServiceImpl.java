package com.cydeo.service.impl;

import com.cydeo.model.Account;
import com.cydeo.model.Transaction;
import com.example.banksimulationapplication.model.Account;
import com.example.banksimulationapplication.model.Transaction;
import com.example.banksimulationapplication.service.TransactionService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class TransactionServiceImpl implements TransactionService {

    @Override
    public Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message) {
        return null;
    }

    @Override
    public List<Transaction> findAllTransaction() {
        return null;
    }
}

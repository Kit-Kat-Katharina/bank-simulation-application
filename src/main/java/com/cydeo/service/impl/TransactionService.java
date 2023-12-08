package com.cydeo.service.impl;

import com.cydeo.model.Account;
import com.cydeo.model.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface TransactionService {

    Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message);
    List<Transaction> findAllTransaction();
    List<Transaction> last10Transactions();
}

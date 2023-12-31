package com.cydeo.service.impl;

import com.cydeo.enums.AccountStatus;
import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;
import com.cydeo.repository.AccountRepository;
import com.cydeo.service.AccountService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class AccountServiceImpl implements AccountService {
    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public Account createNewAccount(BigDecimal balance, Date createDate, AccountType accountType, Long userId) {
        //we need to create Account object
        Account account = Account.builder().id(UUID.randomUUID()).userId(userId).accountType(accountType).creationDate(createDate).balance(balance).accountStatus(AccountStatus.ACTIVE).build();
        //save into the dataBase(repository)
        //return the object created
        return  accountRepository.save(account);
    }

    @Override
    public List<Account> listAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public void deleteAccount(UUID id) {
        Account account = accountRepository.findById(id);
        account.setAccountStatus(AccountStatus.DELETED);
       // accountRepository.findAll().stream().filter(account -> account.getId().equals(id)).findAny().get();
    }

    @Override
    public void activateAccount(UUID id) {
        Account account = accountRepository.findById(id);
        account.setAccountStatus(AccountStatus.ACTIVE);
    }

    @Override
    public Account retrieveById(UUID id) {
        return accountRepository.findById(id);
    }
}

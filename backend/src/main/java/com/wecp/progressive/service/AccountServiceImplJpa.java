package com.wecp.progressive.service;


import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

@Service
public class AccountServiceImplJpa implements AccountService{

    private AccountRepository accountRepository;
    @Autowired
    public AccountServiceImplJpa(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return accountRepository.findAll();
    }

    @Override
    public List<Accounts> getAccountsByUser(int customerId) throws SQLException {
        return accountRepository.getAccountsByCustomerCustomerId(customerId);
    }

    @Override
    public Accounts getAccountById(int accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public int addAccount(Accounts accounts) {
        return accountRepository.save(accounts).getAccountId();
    }

    @Override
    public void updateAccount(Accounts accounts) {
        accountRepository.save(accounts);
    }

    @Override
    public void deleteAccount(int accountId) {
        accountRepository.deleteById(accountId);
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        List<Accounts> sortedAccounts = getAllAccounts();
        sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
        return sortedAccounts;
    }

    // Do not implement these methods
    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return null;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        return null;
    }

    @Override
    public void emptyArrayList() {

    }
}
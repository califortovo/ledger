package com.atlant.ledger.business.service;

import com.atlant.ledger.business.model.Account;
import com.atlant.ledger.business.repository.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    public Account save(Account account) {
        return accountRepo.save(account);
    }

}

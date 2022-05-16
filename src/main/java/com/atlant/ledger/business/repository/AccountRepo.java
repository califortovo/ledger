package com.atlant.ledger.business.repository;

import com.atlant.ledger.business.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends CrudRepository<Account, Long> {

    List<Account> findAll();

    Account save(Account account);

}

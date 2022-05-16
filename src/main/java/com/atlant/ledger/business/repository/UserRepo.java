package com.atlant.ledger.business.repository;

import com.atlant.ledger.business.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    @Override
    @NonNull
    <S extends User> S save(S entity);

}

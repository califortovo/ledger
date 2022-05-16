package com.atlant.ledger.business.service;

import com.atlant.ledger.business.model.User;
import com.atlant.ledger.business.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepo userRepo;


    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void save(User user) {
        user.setCreatedAt(LocalDate.now());
        userRepo.save(user);
    }
}

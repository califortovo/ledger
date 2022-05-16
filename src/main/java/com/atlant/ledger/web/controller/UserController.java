package com.atlant.ledger.web.controller;

import com.atlant.ledger.business.model.User;
import com.atlant.ledger.business.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Repository
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/add")
    public String getUserForm(User user) {
        return "user/userForm";
    }

    @PostMapping("/add")
    public String processUser(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "user/userForm";
        }
        userService.save(user);
        log.info("Saved user: {}", user);
        return "redirect:/";
    }
}

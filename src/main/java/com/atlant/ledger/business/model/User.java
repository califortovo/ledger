package com.atlant.ledger.business.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    @Size(min = 5, max = 30)
    // TODO: add unique constraint to frontend
    private String username;

    @Column(nullable = false)
    @Email
    // TODO: add unique constraint to frontend
    private String email;

    @Column(name = "pswrd", nullable = false)
    @NotBlank
    private String password;

    @Column
    private LocalDate createdAt;


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

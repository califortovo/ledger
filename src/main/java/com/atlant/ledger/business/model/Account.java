package com.atlant.ledger.business.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal balance;


    public Account() {
    }

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

//    @Column
////    http://developer.alexanderklimov.ru/android/java/currency.php
//    private Currency currency;

//    @Transient
//    private String balanceWithCurrency;
//
//
//    public String getBalanceWithCurrency() {
//        return balanceWithCurrency;
//    }
}

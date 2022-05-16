package com.atlant.ledger.business.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private LocalDateTime timestamp;

    @Column
    private BigDecimal value;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Category category;

}

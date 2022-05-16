package com.atlant.ledger.business.model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

    public enum CategoryType {
        MANDATORY, OPTIONAL
    }

}

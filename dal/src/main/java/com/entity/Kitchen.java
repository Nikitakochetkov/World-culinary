package com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "country")
    String country;

    public Kitchen() {
    }

    public Kitchen(Integer id, String country) {
        this.id = id;
        this.country = country;
    }
}

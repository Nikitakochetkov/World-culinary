package com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reciept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    Integer user_id;

    public Reciept() {
    }

    public Reciept(Integer id) {
        this.id = id;
    }

    public Reciept(Integer id, Integer user_id) {
        this.id = id;
        this.user_id = user_id;
    }
}

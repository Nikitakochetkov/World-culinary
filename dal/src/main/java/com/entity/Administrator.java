package com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "permission")
    String permission;

    @Column(name = "user_id")
    Integer user_id;

    public Administrator() {
    }

    public Administrator(Integer id) {
        this.id = id;
    }

    public Administrator(Integer id ,String permission, Integer user_id) {
        this.id = id;
        this.permission = permission;
        this.user_id = user_id;
    }
}

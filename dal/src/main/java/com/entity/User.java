package com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    String firstname;

    @Column(name = "role")
    String role;

    @Column(name = "lastname")
    String lastname;

    @Column(name = "age")
    Integer age;

    @Column(name = "nickname")
    String nickname;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String firstname, String role, String lastname, Integer age, String nickname) {
        this.id = id;
        this.firstname = firstname;
        this.role = role;
        this.lastname = lastname;
        this.age = age;
        this.nickname = nickname;
    }
}

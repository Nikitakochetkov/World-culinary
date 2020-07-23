package com.dao;

public interface Dao<T> {

    void create(T t);

    void update(T t);

    void delete(T t);

    T find(int id);

}

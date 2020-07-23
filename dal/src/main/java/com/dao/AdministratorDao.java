package com.dao;

import com.entity.Administrator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdministratorDao implements Dao<Administrator> {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void create(Administrator administrator) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(administrator);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Administrator administrator) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(administrator);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Administrator administrator) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(administrator);
        transaction.commit();
        session.close();
    }

    @Override
    public Administrator find(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Administrator administrator = session.find(Administrator.class, id);
        transaction.commit();
        session.close();
        return administrator;
    }
}

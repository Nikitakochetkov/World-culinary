package com.dao;
import com.entity.Kitchen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class KitchenDao implements Dao<Kitchen> {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void create(Kitchen kitchen) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(kitchen);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Kitchen kitchen) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(kitchen);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Kitchen kitchen) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(kitchen);
        transaction.commit();
        session.close();
    }

    @Override
    public Kitchen find(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Kitchen kitchen = session.find(Kitchen.class, id);
        transaction.commit();
        session.close();
        return kitchen;
    }
}

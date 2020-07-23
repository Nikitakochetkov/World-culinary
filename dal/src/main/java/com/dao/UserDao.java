package com.dao;
import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao implements Dao<User> {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    @Override
    public User find(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, id);
        transaction.commit();
        session.close();
        return user;
    }
}

package com.dao;
import com.entity.Reciept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecieptDao implements Dao<Reciept> {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void create(Reciept reciept) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(reciept);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Reciept reciept) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(reciept);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Reciept reciept) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(reciept);
        transaction.commit();
        session.close();
    }

    @Override
    public Reciept find(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Reciept reciept = session.find(Reciept.class, id);
        transaction.commit();
        session.close();
        return reciept;
    }
}

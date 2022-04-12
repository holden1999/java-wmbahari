package com.enigma.wmbahari.dao;

import com.enigma.wmbahari.config.HibernateConfig;
import com.enigma.wmbahari.model.Table;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TableDao {
    Session session = HibernateConfig.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    public List<Table> getAllTable() {
        Query query = session.createQuery("from Table");
        return query.getResultList();
    }

    public void updateTable(Table table) {
        try {
            session.update(table);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}

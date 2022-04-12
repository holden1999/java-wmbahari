package com.enigma.wmbahari.dao;

import com.enigma.wmbahari.config.HibernateConfig;
import com.enigma.wmbahari.model.Food;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class FoodDao {
    Session session = HibernateConfig.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    public List<Food> getAllFood() {
        Query query = session.createQuery("from Food");
        return query.getResultList();
    }

    public Food getFoodId(Integer id) {
        Food food = session.get(Food.class, id);
        return food;
    }

    public void saveFood(Food food) {
        try {
            session.save(food);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void updateFood(Food food) {
        try {
            session.update(food);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}

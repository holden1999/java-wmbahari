package com.enigma.wmbahari.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            sessionFactory = configuration.configure("Hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }
}

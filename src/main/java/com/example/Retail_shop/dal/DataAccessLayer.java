package com.example.Retail_shop.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class DataAccessLayer {
    private SessionFactory sessionFactory;

    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    Session session = null;

}

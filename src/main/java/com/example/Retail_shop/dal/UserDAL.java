package com.example.Retail_shop.dal;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAL {
        private final SessionFactory sessionFactory;

        @Autowired
        public UserDAL(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
    }

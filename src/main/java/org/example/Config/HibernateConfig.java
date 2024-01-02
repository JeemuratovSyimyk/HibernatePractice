package org.example.Config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.Entity.BaseEntity;
import org.example.Entity.Programmer;
import org.example.Entity.Project;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfig {
    public static SessionFactory createSessionFactory() {

        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "postgres");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.FORMAT_SQL, "true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
          configuration.addAnnotatedClass(Programmer.class);
          configuration.addAnnotatedClass(Project.class);
        System.out.println("successfully connected");

     return configuration.buildSessionFactory();

    }
    public static EntityManagerFactory entityManagerFactory(){
        return  createSessionFactory().unwrap(EntityManagerFactory.class);
    }
}
package ru.iac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by konenkov on 12.02.2015.
 * Service class to open session to DB*
 */
public class HibernateUtil {


    private final static HibernateUtil instance = new HibernateUtil();
    private static SessionFactory sessionFactory;
    private final SessionFactory factory;

    private HibernateUtil() {
        Configuration configuration = new Configuration();
        configuration.configure("./hibernate.cfg.xml");
        StandardServiceRegistryBuilder srBuilder = new StandardServiceRegistryBuilder();
        srBuilder.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = srBuilder.build();
        factory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static Session getSession() {
        return getInstance().factory.openSession();
    }

    private static HibernateUtil getInstance() {
        return instance;
    }
}

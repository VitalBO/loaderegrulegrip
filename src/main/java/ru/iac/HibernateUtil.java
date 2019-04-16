package ru.iac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by konenkov on 12.02.2015.
 * Service class to open session to DB*
 */
public class HibernateUtil {

    private static final Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);

    private final static HibernateUtil instance = new HibernateUtil();
    private static SessionFactory sessionFactory;
    private final SessionFactory factory;

    private HibernateUtil() {
        File propertiesFile = new File("loadtoegrul.properties");
        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").loadProperties(propertiesFile).build();
        try{
            factory = new Configuration().buildSessionFactory(registry);
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw new RuntimeException(e);
        }
    }

    public static Session getSession() {
        return getInstance().factory.openSession();
    }

    private static HibernateUtil getInstance() {
        return instance;
    }
}

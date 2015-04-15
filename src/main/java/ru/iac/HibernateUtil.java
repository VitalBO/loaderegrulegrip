package ru.iac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("loadtoegrul.properties"));
        } catch (IOException e) {
            LOG.error("Not found hibernate config file (loadtoegrul.properties) exception");
        }
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml").addProperties(properties);
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

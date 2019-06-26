//*
package ru.spb.iac.toris.egrulegrip.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spb.iac.toris.egrulegrip.configuration.ConnectConfiguration;

import java.util.Properties;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@Service
public class HibernateUtil {

    private static final Logger LOG = LogManager.getLogger(HibernateUtil.class);

    //@Autowired
    private final ConnectConfiguration connectConfiguration;

    //private final static HibernateUtil instance = new HibernateUtil();
    //private static SessionFactory sessionFactory;
    private static Properties settings;
    private static SessionFactory factory;
    //private static ServiceRegistry registry;

    @Autowired
    private HibernateUtil(ConnectConfiguration connectConfiguration){
        this.connectConfiguration = connectConfiguration;
        settings = new Properties();
//        settings.put(Environment./*JPA_JDBC_*/DRIVER, this.connectConfiguration.getDriverClassName());
        settings.put(Environment./*JPA_JDBC_*/URL, this.connectConfiguration.getUrl());
        settings.put(Environment./*JPA_JDBC_*/USER, this.connectConfiguration.getUsername());
        settings.put(Environment./*JPA_JDBC_*/PASS/*WORD*/, this.connectConfiguration.getPassword());
        Configuration config = new Configuration();
        config.addProperties(HibernateUtil.settings);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").applySettings(config.getProperties()).build();
        try{
            factory = new Configuration().buildSessionFactory(registry);
        } catch (Exception e) {
            LOG.error("Error loading properties", e.getMessage());
            StandardServiceRegistryBuilder.destroy(registry);
            throw new RuntimeException(e);
        }
    }
    public static Session getSession(){
        return getFactory().openSession();

    }
    private static SessionFactory getFactory(){
        return factory;
    }
}

//public class HibernateUtil {
//
//    private static final Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);
//
//    private final static HibernateUtil instance = new HibernateUtil();
//    private static SessionFactory sessionFactory;
//    private final SessionFactory factory;
//
//    private HibernateUtil() {
//        File propertiesFile = new File("loadtoegrul.properties");
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").loadProperties(propertiesFile).build();
//        try{
//            factory = new Configuration().buildSessionFactory(registry);
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static Session getSession() {
//        return getInstance().factory.openSession();
//    }
//
//    private static HibernateUtil getInstance() {
//        return instance;
//    }
//}






//    private HibernateUtil() {
////        Properties settings = new Properties();
////        settings.put(Environment.DRIVER, connectConfiguration.getDriver_class());
////        settings.put(Environment.URL, connectConfiguration.getUrl());
////        settings.put(Environment.USER, connectConfiguration.getUsername());
////        settings.put(Environment.PASS, connectConfiguration.getPassword());
//        Configuration config = new Configuration().configure("hibernate.cfg.xml");
//        config.setProperties(settings);
////        File propertiesFile = new File("src\\main\\resources\\application.properties"/*"loadtoegrul.properties"*/);
////        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").loadProperties(propertiesFile).build();
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//        try{
//            factory = new Configuration().buildSessionFactory(registry);
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//            throw new RuntimeException(e);
//        }
//    }

//    public static Session getSession() {
//
//    }
//
//    private static HibernateUtil getInstance() {
//        return instance;
//    }

//*/
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

@Service
public class HibernateUtil {

    private static final Logger LOG = LogManager.getLogger(HibernateUtil.class);

    private final ConnectConfiguration connectConfiguration;
    private static Properties settings;
    private static SessionFactory factory;

    @Autowired
    private HibernateUtil(ConnectConfiguration connectConfiguration){
        this.connectConfiguration = connectConfiguration;
        settings = new Properties();
        settings.put(Environment.URL, this.connectConfiguration.getUrl());
        settings.put(Environment.USER, this.connectConfiguration.getUsername());
        settings.put(Environment.PASS, this.connectConfiguration.getPassword());
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

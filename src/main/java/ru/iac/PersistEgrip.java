package ru.iac;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

/**
 * Created by konenkov on 12.02.2015.
 */
public abstract class PersistEgrip {

    private static Logger log = LoggerFactory.getLogger(PersistEgrip.class);

    public static void saveOrUpdate(Object object) {

        //try {
            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(object);
            tx.commit();
            session.close();
        /*} catch (Exception ex) {
            log.debug("Error while saving to DB");
            log.debug(ex.getMessage());
        }*/

    }

    public static Object getFromDB(String classname, Integer id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object object = session.get(classname, id);
        tx.commit();
        session.close();
        return object;
    }

    public static Object getFromDB(String classname, BigInteger id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object object = session.get(classname, id);
        tx.commit();
        session.close();
        return object;
    }

    public static Object getFromDB(String classname, String id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object object = session.get(classname, id);
        tx.commit();
        session.close();
        return object;
    }

    public static Object getFromDBbyNaturalId(String classname, String kod) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object object = session.byNaturalId(classname).using("kod", kod).load();
        tx.commit();
        session.close();
        return object;
    }

    public static void removeFromDB(Object object) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.delete(object);
        tx.commit();
        session.close();

    }

    public static Object getNamedQuery(String queryName, String parametrName, String parametr) {
        Object object;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        org.hibernate.Query query = session.getNamedQuery(queryName);
        query.setParameter(parametrName, parametr);
        try {
            object = query.uniqueResult();
        } catch (NonUniqueResultException exception) {
            log.debug("Error " + exception.getMessage());
            object = null;
        }
        tx.commit();
        session.close();
        return object;
    }

}

package ru.iac;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by konenkov on 12.02.2015.
 * Service class to simple work with DB *
 * *
 */
public abstract class EgrulDAO {

    private static Logger log = LoggerFactory.getLogger(EgrulDAO.class);


    public static void saveOrUpdate(Object object) {

        try {
            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(object);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            log.error("Error while saving to DB");
            log.error(ex.getMessage());
        }

    }

    public static Object getFromDB(String classname, String id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object object = session.get(classname, id);
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

    public static Object getNamedQuery(String queryName, String parametrName, String parametr, Session session) {
        Object object;
        org.hibernate.Query query = session.getNamedQuery(queryName);
        query.setParameter(parametrName, parametr);
        try {
            object = query.uniqueResult();
        } catch (NonUniqueResultException exception) {
            log.error("Error " + exception.getMessage());
            object = null;
        }
        return object;
    }

    public static void callProcedure() {
        Session session = HibernateUtil.getSession();
        session.createSQLQuery("CALL rush.PK.link_all");
        session.close();
    }

}

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

    private static Logger LOG = LoggerFactory.getLogger(EgrulDAO.class);


    public static void saveOrUpdate(Object object) {

        Session session = HibernateUtil.getSession();
        try {
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(object);
            tx.commit();
        } catch (Exception ex) {
            LOG.error("Error while saving to DB");
            LOG.error(ex.getMessage());
        } finally {
            session.close();
        }
    }

    public static Object getFromDB(String classname, String id) {
        Session session = HibernateUtil.getSession();
        Object object = session.get(classname, id);
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
            LOG.error("Error executing named query ", exception);
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

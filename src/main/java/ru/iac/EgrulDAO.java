package ru.iac;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

/**
 * Created by konenkov on 12.02.2015.
 * <p/>
 * Class to work with DB
 * *
 */
public abstract class EgrulDAO {

    private static Logger log = LoggerFactory.getLogger(EgrulDAO.class);


/*    public static EgrulEntity saveOrUpdateRef(EgrulEntity egrulEntity, Session session) {
        try {
            Object obj = null;
            if (egrulEntity.getIdenti() != null)
                obj = session.get(egrulEntity.getClass().getName(), egrulEntity.getIdenti());
            if (obj == null || egrulEntity instanceof EgrulWithNaturalId) {
                EgrulWithNaturalId egrulWithNaturalId = (EgrulWithNaturalId) egrulEntity;
                org.hibernate.Query query = session.getNamedQuery(egrulWithNaturalId.returnNaturalIdQuery());
                query.setParameter("kod", egrulWithNaturalId.getnaturalId());
                obj = query.uniqueResult();

            }
            if (obj == null) session.saveOrUpdate(egrulEntity);
            else egrulEntity = (EgrulEntity) obj;

        } catch (Exception ex) {
            log.error("Error while saving to DB");
            log.error(ex.getMessage());
        }
        return egrulEntity;
    }*/

/*    public static void saveOrUpdateChildTables(EgrulEntity egrulEntity, String parametr, String value, Session session) {
        try {
            Criteria criteria = session.createCriteria(egrulEntity.getClass().getName());
            criteria.add(Restrictions.eq(parametr, value));
            List<EgrulEntity> list = criteria.list();
            for (EgrulEntity temp : list) {
                session.delete(temp);
            }
            //session.saveOrUpdate(egrulEntity.getClass().getName(), egrulEntity);
        } catch (Exception ex) {
            log.error("Error while saving to DB");
            log.error(ex.getMessage());
        }
    }*/


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

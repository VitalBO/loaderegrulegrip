package ru.spb.iac.toris.egrulegrip.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.spb.iac.toris.egrulegrip.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Repository
//@Service
public class DataRepository implements IDataRepository{

    private static Logger LOG = LogManager.getLogger(DataRepository.class);

//    @PersistenceContext
//    private EntityManager em;

    public void saveOrUpdate(Object object) {
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
    public Object getFromDB(String classname, String id) {
        Session session=null;
        Object object = null;
        try{
            session = HibernateUtil.getSession();
            object = session.get(classname, id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return object;
    }

    public void removeFromDB(Object object) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.getTransaction();
        if (!session.getTransaction().isActive()) tx = session.beginTransaction();
        session.delete(object);
        tx.commit();
        session.close();
    }

    public Object getNamedQuery(String queryName, String parametrName, String parametr, Session session) {
        Object object = null;
        Query query = session.getNamedQuery(queryName);
        query.setParameter(parametrName, parametr);
        List list = query.list();
        if (list.size() > 0) {
            object = list.get(0);
        }
        return object;
    }

    public void callProcedure() {
        Session session = HibernateUtil.getSession();
        session.createSQLQuery("CALL rush.PK.link_all");
        session.close();
    }
}

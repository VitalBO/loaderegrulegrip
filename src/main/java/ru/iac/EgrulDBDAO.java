package ru.iac;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.iac.entity.*;

import java.math.BigInteger;

/**
 * Created by konenkov on 12.02.2015.
 * <p/>
 * Class to work with DB
 * *
 */
public abstract class EgrulDBDAO {

    private static Logger log = LoggerFactory.getLogger(EgrulDBDAO.class);

    public static void saveIpToDB(Ip ip) {
        //try {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        Spfoms spfoms = (Spfoms) getFromDBbyNaturalId(ip.getIpfoms().getIdfoms().getClass().getName(), ip.getIpfoms().getIdfoms().getKod());
        if (spfoms == null) session.saveOrUpdate(ip.getIpfoms().getIdfoms());
        else ip.getIpfoms().setIdfoms(spfoms);
        Spfss spfss = (Spfss) getFromDBbyNaturalId(ip.getIpfss().getIdfss().getClass().getName(), ip.getIpfss().getIdfss().getKod());
        if (spfss == null) session.saveOrUpdate(ip.getIpfss().getIdfss());
        else ip.getIpfss().setIdfss(spfss);
        Spmns spmns = (Spmns) getFromDBbyNaturalId(ip.getIpmns().getIdmns().getClass().getName(), ip.getIpmns().getIdmns().getKod());
        if (spmns == null) session.saveOrUpdate(ip.getIpmns().getIdmns());
        else ip.getIpmns().setIdmns(spmns);
        Sppf sppf = (Sppf) getFromDBbyNaturalId(ip.getIppf().getIdpf().getClass().getName(), ip.getIppf().getIdpf().getKod());
        if (sppf == null) session.saveOrUpdate(ip.getIppf().getIdpf());
        else ip.getIppf().setIdpf(sppf);
        session.saveOrUpdate(ip.getIpregold().getIdregorg());
        session.saveOrUpdate(ip.getIdregorg());
        session.saveOrUpdate(ip.getIpcitizen().getOksm());
        session.saveOrUpdate(ip.getIpdokdsn().getIddokdn());
        session.saveOrUpdate(ip.getIpdokdsn().getIdosndn());
        for (Ipokved ipokved : ip.getIpokved()) {
            session.saveOrUpdate(ipokved.getIdokved());
        }
        for (Ipgosreg ipgosreg : ip.getIpgosregs()) {
            Spregorg spregorg = (Spregorg) session.get(ipgosreg.getIdregorg().getClass().getName(), ipgosreg.getIdregorg().getIdspro());
            if (spregorg == null) session.saveOrUpdate(ipgosreg.getIdregorg());
            else ipgosreg.setIdregorg(spregorg);
        }
        for (Licenz licenz : ip.getLicenzs()) {
            session.saveOrUpdate(licenz.getIdlicorg());
            session.saveOrUpdate(licenz.getIdsostlic());
            session.saveOrUpdate(licenz.getIdvidlic());
        }
        
        session.saveOrUpdate(ip);
        tx.commit();
        session.close();
/*        } catch (Exception ex) {
            log.debug("Error while saving to DB");
            log.debug(ex.getMessage());
        }*/
    }


    public static void saveOrUpdate(Object object) {

        try {
            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(object);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            log.debug("Error while saving to DB");
            log.debug(ex.getMessage());
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

    public static void callProcedure() {
        Session session = HibernateUtil.getSession();
        session.createSQLQuery("CALL rush.PK.link_all");
        session.close();
    }

}

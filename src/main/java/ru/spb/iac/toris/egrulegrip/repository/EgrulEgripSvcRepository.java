package ru.spb.iac.toris.egrulegrip.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.CacheMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spb.iac.toris.egrulegrip.model.*;
import ru.spb.iac.toris.egrulegrip.utils.HibernateUtil;
import ru.spb.iac.toris.egrulegrip.utils.Util;

import javax.persistence.EntityManager;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

//@Repository
@Service
public class EgrulEgripSvcRepository {

    private static Logger LOG = LogManager.getLogger(EgrulEgripSvcRepository.class);

    @Autowired
    private EntityManager em;

    @Autowired
    private IDataRepository dataRepository;

    public int saveIpToDB(Ip ip) {

        Ip ipOld = (Ip) dataRepository.getFromDB(Ip.class.getName(), ip.getIdip());
        if (ipOld != null) {
            dataRepository.removeFromDB(ipOld);
        }
        Session session = HibernateUtil.getSession();
        session.setCacheMode(CacheMode.IGNORE);
        Transaction tx = session.beginTransaction();
        try {
            if (ip.getIpfoms() != null) {
                Spfoms spfoms = (Spfoms) dataRepository.getNamedQuery(Spfoms.FIND_BY_NATURALID, "kod", ip.getIpfoms().getIdfoms().getKod(), session);
                if (spfoms == null) {
                    session.saveOrUpdate(ip.getIpfoms().getIdfoms());
                }
                else ip.getIpfoms().setIdfoms(spfoms);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ip.getIpfss() != null) {
                Spfss spfss = (Spfss) dataRepository.getNamedQuery(Spfss.FIND_BY_NATURALID, "kod", ip.getIpfss().getIdfss().getKod(), session);
                if (spfss == null) {
                    session.saveOrUpdate(ip.getIpfss().getIdfss());
                }
                else ip.getIpfss().setIdfss(spfss);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ip.getIpmns() != null) {
                Spmns spmns = (Spmns) dataRepository.getNamedQuery(Spmns.FIND_BY_NATURALID, "kod", ip.getIpmns().getIdmns().getKod(), session);
                if (spmns == null) {
                    session.saveOrUpdate(ip.getIpmns().getIdmns());
                }
                else ip.getIpmns().setIdmns(spmns);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ip.getIppf() != null) {
                Sppf sppf = (Sppf) dataRepository.getNamedQuery(Sppf.FIND_BY_NATURALID, "kod", ip.getIppf().getIdpf().getKod(), session);
                if (sppf == null){
                    session.saveOrUpdate(ip.getIppf().getIdpf());
                }
                else ip.getIppf().setIdpf(sppf);
            }
            tx.commit();
            tx=session.beginTransaction();
            if (ip.getIpokved() != null) {
                for (Ipokved ipokved : ip.getIpokved()) {
                    Okved okved = (Okved) dataRepository.getNamedQuery(Okved.FIND_BY_NATURALID, "kod", ipokved.getIdokved().getCodeOkved(), session);
                    if (okved == null) {
                        session.saveOrUpdate(ipokved.getIdokved());
                    }
                    else ipokved.setIdokved(okved);
                }
            }
            tx.commit();
            tx = session.beginTransaction();
            session.saveOrUpdate(ip);
            tx.commit();
            LOG.debug("Successfully saved to DB " + ip.getOgrn());
//            LOG.info("Successfully saved to DB " + ip.getOgrn());
            return Util.SUCCESS;
        } catch (Exception ex) {
            LOG.error("Error while saving to DB IP " + ip.getOgrn(), ex);
//            LOG.info("Error while saving to DB IP " + ip.getOgrn(), ex);
            tx.rollback();/////
            return Util.ERROR;
        } finally {
            session.close();
        }
    }

    public int saveUlToDB(Ul ul) {
        Ul ulOld = (Ul) dataRepository.getFromDB(Ul.class.getName(), ul.getIdul());
        if (ulOld != null) dataRepository.removeFromDB(ulOld);
        Session session = HibernateUtil.getSession();
        session.setCacheMode(CacheMode.IGNORE);
        Transaction tx = session.beginTransaction();
        try {
            if (ul.getUlfoms() != null) {
                Spfoms spfoms = (Spfoms) dataRepository.getNamedQuery(Spfoms.FIND_BY_NATURALID, "kod", ul.getUlfoms().getIdfoms().getKod(), session);
                if (spfoms == null) session.saveOrUpdate(ul.getUlfoms().getIdfoms());
            else ul.getUlfoms().setIdfoms(spfoms);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ul.getUlfss() != null) {
                Spfss spfss = (Spfss) dataRepository.getNamedQuery(Spfss.FIND_BY_NATURALID, "kod", ul.getUlfss().getIdfss().getKod(), session);
                if (spfss == null) session.saveOrUpdate(ul.getUlfss().getIdfss());
            else ul.getUlfss().setIdfss(spfss);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ul.getUlmns() != null) {
                Spmns spmns = (Spmns) dataRepository.getNamedQuery(Spmns.FIND_BY_NATURALID, "kod", ul.getUlmns().getIdmns().getKod(), session);
                if (spmns == null) session.saveOrUpdate(ul.getUlmns().getIdmns());
                else ul.getUlmns().setIdmns(spmns);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ul.getUlpf() != null) {
                Sppf sppf = (Sppf) dataRepository.getNamedQuery(Sppf.FIND_BY_NATURALID, "kod", ul.getUlpf().getIdpf().getKod(), session);
                if (sppf == null) session.saveOrUpdate(ul.getUlpf().getIdpf());
                else ul.getUlpf().setIdpf(sppf);
            }
            tx.commit();
            tx = session.beginTransaction();
            if (ul.getUlokved() != null) {
                for (Ulokved ulokved : ul.getUlokved()) {
                    Okved okved = (Okved) dataRepository.getNamedQuery(Okved.FIND_BY_NATURALID, "kod", ulokved.getIdokved().getCodeOkved(), session);
                    if (okved == null) session.saveOrUpdate(ulokved.getIdokved());
                    else ulokved.setIdokved(okved);
                }
            }
            tx.commit();
            tx = session.beginTransaction();
            session.saveOrUpdate(ul);
            tx.commit();
            LOG.debug("Successfully saved UL " + ul.getOgrn());
            //LOG.info("Successfully saved UL " + ul.getOgrn());///////////////////
            return Util.SUCCESS;
        } catch (Exception ex) {
            LOG.error("Error while saving to DB UL " + ul.getOgrn(), ex);
            //LOG.info("Error while saving to DB UL " + ul.getOgrn(), ex);///////
            tx.rollback();
            return Util.ERROR;
        } finally {
            session.close();
        }
    }
    //*****************************************************************//

//    public /*static*/ void saveOrUpdate(Object object) {
//        Session session = em.unwrap(Session.class);
//        try {
////                Transaction tx = session.beginTransaction();
//            session.saveOrUpdate(object);
////                tx.commit();
//        } catch (Exception ex) {
//            LOG.error("Error while saving to DB");
//            LOG.error(ex.getMessage());
//        } finally {
//            //session.close();
//            em.flush();
//            em.clear();
//        }
//    }
//
//    public /*static*/ Object getFromDB(String classname, String id) {
//        //Session session = em.unwrap(Session.class);///////////////////////////
//        //Session session = getSession();
//        Session session = HibernateUtil.getSession();
//        //System.err.println (session.createSQLQuery("SELECT count(*) FROM IP").list().get(0));//////////////
//        //System.err.println (em.createNativeQuery("SELECT count(*) FROM IP").getResultList().get(0));/////////
//        Object object = session.get(classname, id);///////////
//        session.close();
//        return object;
//    }
//    public Object getFromDB(Class clazz, String id) {
//        Object object = em.find(clazz, id);
//        return object;
//    }
//
//    public /*static*/ void removeFromDBHib(Object object) {
//        //Session session = em.unwrap(Session.class);
//        //Session session = getSession();/////
//        Session session = HibernateUtil.getSession();
//        Transaction tx = session.getTransaction();
//        if (!session.getTransaction().isActive()) tx = session.beginTransaction();
//        //em.getTransaction().begin();////////////
//        //getSession().delete(object); //
//        session.delete(object);
//        tx.commit();
//        //session.flush();/////////////////
//        //em.getTransaction().commit();/////////////////
//        session.close();
//        //tx.commit();
//    }
//
//    public void removeFromDB(Object object) {
//        //object=em.merge(object);
//        em.remove(object);
//        //em.flush();
//        //em.clear();
//    }
//
//    public /*static*/ Object getNamedQuery(String queryName, String parametrName, String parametr, Session session) {
//        Object object = null;
//        org.hibernate.query.Query query = session.getNamedQuery(queryName);
//        query.setParameter(parametrName, parametr);
//        List list = query.list();
//        if (list.size() > 0) {
//            object = list.get(0);
//        }
//        return object;
//    }
/////////////////////////////////////
////  public Object getNamedQuery(String queryName, String parametrName, String parametr, Session session) {
////      Object object = null;
////      List list = em.createNamedQuery(queryName).setParameter(parametrName, parametr).getResultList();
////      if (list.size() > 0) {
////          object = list.get(0);
////      }
////      return object;
////  }
////////////////////////////
//
//    public Session getSession(){
//        File propertiesFile = new File("application.properties");
//        SessionFactory factory;
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").loadProperties(propertiesFile).build();
//        try{
//            factory = new Configuration().buildSessionFactory(registry);
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//                throw new RuntimeException(e);
//        }
//        return factory.openSession();
//        //return em.unwrap(Session.class);
//    }
}

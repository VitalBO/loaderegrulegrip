package ru.iac;

import org.hibernate.CacheMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.iac.entity.*;

/**
 * Created by konenkov on 25.02.2015.
 */
public class EgrulService {

    private static Logger log = LoggerFactory.getLogger(EgrulService.class);

    public static int saveIpToDB(Ip ip) {
        Ip ipOld = (Ip) EgrulDAO.getFromDB(Ip.class.getName(), ip.getIdip());
        if (ipOld != null) EgrulDAO.removeFromDB(ipOld);
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.setCacheMode(CacheMode.IGNORE);
        try {
            if (ip.getIpfoms() != null) {
                Spfoms spfoms = (Spfoms) EgrulDAO.getFromDBbyNaturalId(ip.getIpfoms().getIdfoms().getClass().getName(), ip.getIpfoms().getIdfoms().getKod());
                if (spfoms == null) session.saveOrUpdate(ip.getIpfoms().getIdfoms());
                else ip.getIpfoms().setIdfoms(spfoms);
            }
            if (ip.getIpfss() != null) {
                Spfss spfss = (Spfss) EgrulDAO.getFromDBbyNaturalId(ip.getIpfss().getIdfss().getClass().getName(), ip.getIpfss().getIdfss().getKod());
                if (spfss == null) session.saveOrUpdate(ip.getIpfss().getIdfss());
                else ip.getIpfss().setIdfss(spfss);
            }
            if (ip.getIpmns() != null) {
                Spmns spmns = (Spmns) EgrulDAO.getFromDBbyNaturalId(ip.getIpmns().getIdmns().getClass().getName(), ip.getIpmns().getIdmns().getKod());
                if (spmns == null) session.saveOrUpdate(ip.getIpmns().getIdmns());
                else ip.getIpmns().setIdmns(spmns);
            }
            if (ip.getIppf() != null) {
                Sppf sppf = (Sppf) EgrulDAO.getFromDBbyNaturalId(ip.getIppf().getIdpf().getClass().getName(), ip.getIppf().getIdpf().getKod());
                if (sppf == null) session.saveOrUpdate(ip.getIppf().getIdpf());
                else ip.getIppf().setIdpf(sppf);
            }

            for (Ipokved ipokved : ip.getIpokved()) {
                Okved okved = (Okved) EgrulDAO.getNamedQuery(Okved.FIND_BY_NATURALID, "kod", ipokved.getIdokved().getCodeOkved(), session);
                if (okved == null) session.saveOrUpdate(ipokved.getIdokved());
                else ipokved.setIdokved(okved);
            }
            session.saveOrUpdate(ip);
            tx.commit();
            log.debug("Successfully saved to DB " + ip.getOgrn());
            return Util.SUCCESS;
        } catch (Exception ex) {
            log.error("Error while saving to DB IP " + ip.getOgrn());
            log.error(ex.getMessage());
            ex.printStackTrace();
            return Util.ERROR;
        } finally {
            session.close();
        }
    }

    public static int saveUlToDB(Ul ul) {
        Ul ulOld = (Ul) EgrulDAO.getFromDB(Ul.class.getName(), ul.getIdul());
        if (ulOld != null) EgrulDAO.removeFromDB(ulOld);

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        try {
            if (ul.getUlfoms() != null) {
                Spfoms spfoms = (Spfoms) EgrulDAO.getFromDBbyNaturalId(ul.getUlfoms().getIdfoms().getClass().getName(), ul.getUlfoms().getIdfoms().getKod());
                if (spfoms == null) session.saveOrUpdate(ul.getUlfoms().getIdfoms());
                else ul.getUlfoms().setIdfoms(spfoms);
            }
            if (ul.getUlfss() != null) {
                Spfss spfss = (Spfss) EgrulDAO.getFromDBbyNaturalId(ul.getUlfss().getIdfss().getClass().getName(), ul.getUlfss().getIdfss().getKod());
                if (spfss == null) session.saveOrUpdate(ul.getUlfss().getIdfss());
                else ul.getUlfss().setIdfss(spfss);
            }
            if (ul.getUlmns() != null) {
                Spmns spmns = (Spmns) EgrulDAO.getFromDBbyNaturalId(ul.getUlmns().getIdmns().getClass().getName(), ul.getUlmns().getIdmns().getKod());
                if (spmns == null) session.saveOrUpdate(ul.getUlmns().getIdmns());
                else ul.getUlmns().setIdmns(spmns);
            }
            if (ul.getUlpf() != null) {
                Sppf sppf = (Sppf) EgrulDAO.getFromDBbyNaturalId(ul.getUlpf().getIdpf().getClass().getName(), ul.getUlpf().getIdpf().getKod());
                if (sppf == null) session.saveOrUpdate(ul.getUlpf().getIdpf());
                else ul.getUlpf().setIdpf(sppf);
            }

            for (Ulokved ulokved : ul.getUlokved()) {
                Okved okved = (Okved) EgrulDAO.getNamedQuery(Okved.FIND_BY_NATURALID, "kod", ulokved.getIdokved().getCodeOkved(), session);
                if (okved == null) session.saveOrUpdate(ulokved.getIdokved());
                else ulokved.setIdokved(okved);
            }

            session.saveOrUpdate(ul);
            tx.commit();
            log.debug("Successfully saved UL " + ul.getOgrn());
            return Util.SUCCESS;
        } catch (Exception ex) {
            log.error("Error while saving to DB UL " + ul.getOgrn());
            log.error(ex.getMessage());
            ex.printStackTrace();
            return Util.ERROR;
        } finally {
            session.close();

        }
    }

}

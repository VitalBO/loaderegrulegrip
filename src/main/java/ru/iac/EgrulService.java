package ru.iac;

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

    public static void saveIpToDB(Ip ip) {
        try {
            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            Spfoms spfoms = (Spfoms) EgrulDAO.getFromDBbyNaturalId(ip.getIpfoms().getIdfoms().getClass().getName(), ip.getIpfoms().getIdfoms().getKod());
            if (spfoms == null) session.saveOrUpdate(ip.getIpfoms().getIdfoms());
            else ip.getIpfoms().setIdfoms(spfoms);
            Spfss spfss = (Spfss) EgrulDAO.getFromDBbyNaturalId(ip.getIpfss().getIdfss().getClass().getName(), ip.getIpfss().getIdfss().getKod());
            if (spfss == null) session.saveOrUpdate(ip.getIpfss().getIdfss());
            else ip.getIpfss().setIdfss(spfss);
            Spmns spmns = (Spmns) EgrulDAO.getFromDBbyNaturalId(ip.getIpmns().getIdmns().getClass().getName(), ip.getIpmns().getIdmns().getKod());
            if (spmns == null) session.saveOrUpdate(ip.getIpmns().getIdmns());
            else ip.getIpmns().setIdmns(spmns);
            Sppf sppf = (Sppf) EgrulDAO.getFromDBbyNaturalId(ip.getIppf().getIdpf().getClass().getName(), ip.getIppf().getIdpf().getKod());
            if (sppf == null) session.saveOrUpdate(ip.getIppf().getIdpf());
            else ip.getIppf().setIdpf(sppf);

            session.saveOrUpdate(ip.getIdregorg());
            for (Ipokved ipokved : ip.getIpokved()) {
                session.saveOrUpdate(ipokved.getIdokved());
            }

            for (Ipgosreg ipgosreg : ip.getIpgosregs()) {
                Spregorg spregorg = (Spregorg) session.get(ipgosreg.getIdregorg().getClass().getName(), ipgosreg.getIdregorg().getIdspro());
                if (spregorg == null) session.saveOrUpdate(ipgosreg.getIdregorg());
                else ipgosreg.setIdregorg(spregorg);
                session.saveOrUpdate(ipgosreg.getIdvidreg());
            }

            session.saveOrUpdate(ip);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            log.error("Error while saving to DB");
            log.error(ex.getMessage());
        }
    }
}

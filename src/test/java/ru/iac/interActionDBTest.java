package ru.iac;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import ru.iac.entity.Spfoms;

/**
 * Created by konenkov on 12.02.2015.
 */
public class interActionDBTest extends Assert{


    @Test
    public void testSessionFactory() {
        Session session = HibernateUtil.getSession();
        session.close();
    }

    
    @Test
    public void testGetByNaturalId() {

        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        PersistEgrip.saveOrUpdate(spfoms);
        Spfoms spfoms1 = (Spfoms) PersistEgrip.getFromDBbyNaturalId(Spfoms.class.getName(), "109");
        assertEquals(spfoms.getKod(),spfoms1.getKod());
        PersistEgrip.removeFromDB(spfoms);

    }
    
    @Test
    public void testNamedQuery() {
        Spfoms spfoms = new Spfoms();
        spfoms.setName("asdddd");
        spfoms.setKod("109");
        PersistEgrip.saveOrUpdate(spfoms);
        Spfoms spfoms1 = (Spfoms) PersistEgrip.getNamedQuery(Spfoms.FIND_BY_NAME, "name", "asdddd");
        assertEquals(spfoms.getKod(),spfoms1.getKod());
        PersistEgrip.removeFromDB(spfoms);
    }


}

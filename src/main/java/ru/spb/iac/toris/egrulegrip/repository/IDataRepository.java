package ru.spb.iac.toris.egrulegrip.repository;

import org.hibernate.Session;

public interface IDataRepository {

    void saveOrUpdate(Object object);

    Object getFromDB(String classname, String id);

    void removeFromDB(Object object);

    Object getNamedQuery(String queryName, String parametrName, String parametr, Session session);

    void callProcedure();
}

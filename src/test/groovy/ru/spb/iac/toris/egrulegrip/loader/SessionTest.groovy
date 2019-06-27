package ru.spb.iac.toris.egrulegrip.loader

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.spb.iac.toris.egrulegrip.utils.HibernateUtil
import spock.lang.Specification
import org.hibernate.Session


@SpringBootTest
class SessionTest extends Specification {

    @Autowired(required = false)
    private HibernateUtil hibernateUtil

    def "when connection properties are loaded HibernateUtil is created"() {
        expect: "the SessionFactory is created"
        Session session = hibernateUtil.getSession()
        session.close()
    }
}
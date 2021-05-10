package db.hibernate;

import db.hibernate.models.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DbHibernateService {
    public static Animal getAnimalName(final String name) {
        SessionFactory sessionFactory = HibernateSessionCreator.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.createNamedQuery("select id from public.animal where \"name\" = '" + name + "'", Animal.class)
                .getResultList().get(1);
    }
}

package db.hibernate;

import db.hibernate.models.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DbHibernateService {
    public static Animal getAnimalId(final int id) {
        SessionFactory sessionFactory = HibernateSessionCreator.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.createNamedQuery("select id from public.animal where id = " + id, Animal.class)
                .getResultList().get(1);
    }
}

package db.hibernate;

import db.hibernate.models.Animal;
import db.hibernate.models.Places;
import db.hibernate.models.Workman;
import db.hibernate.models.Zoo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionCreator {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildNewSessionFactory();
        }
        return sessionFactory;
    }

    private static SessionFactory buildNewSessionFactory() {
        return new Configuration()
                .configure()
                .addAnnotatedClass(Animal.class)
                .addAnnotatedClass(Places.class)
                .addAnnotatedClass(Workman.class)
                .addAnnotatedClass(Zoo.class)
                .buildSessionFactory();
    }
}

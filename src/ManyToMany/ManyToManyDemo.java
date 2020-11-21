package ManyToMany;

import OneToMany.Subject;
import OneToMany.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ManyToManyDemo {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml")
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(Items.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
    }
}

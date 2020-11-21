package OneToMany;

import OneToOne.LapTop;
import OneToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class OneToMany {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml")
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(Subject.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
    }
}

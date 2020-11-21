package lk.ac.uok.setu;


import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(LapTop.class);

    }
}

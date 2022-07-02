package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class,  1);
//            emp.setSalary(50000);

            session.createQuery("update Employee set salary = 10000 where name = 'Alex'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}

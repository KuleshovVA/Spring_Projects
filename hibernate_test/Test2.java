package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {

            Session session = factory.getCurrentSession();


            Employee emp = new Employee("Oleg", "Sidorov", "HR", 150);
            session.beginTransaction();
            session.save(emp);
  //          session.getTransaction().commit();

            int myId = emp.getId();
  //          session = factory.getCurrentSession();
  //          session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}

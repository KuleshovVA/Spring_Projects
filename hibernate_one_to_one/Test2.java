package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {

//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nick", "Pomm", "IT", 10000);
//            Detail detail = new Detail("NY", "123we23567", "Nick email@gmail.ru");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 2);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 2);

            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            session.close();
            factory.close();
        }
    }
}

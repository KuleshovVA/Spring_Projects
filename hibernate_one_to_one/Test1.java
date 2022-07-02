package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//
//            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Vitaly", "Kuleshov", "IT", 100000);
            Detail detail = new Detail("Moscow", "1234567", "Viemail@gmail.ru");
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");




//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oled", "Smirnov", "Sales", 100);
//            Detail detail = new Detail("London", "1234434357", "Olegemail@gmail.ru");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");



            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}

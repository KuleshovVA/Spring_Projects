package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {

//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 1000000, 100);
//
//            Employee emp1 = new Employee("Oelg", "Frolov", 100000);
//            Employee emp2 = new Employee("Misha", "Ivanov", 10000);
//
//            dep.addEmployeeToDepartmant(emp1);
//            dep.addEmployeeToDepartmant(emp2);
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartmant());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
////


// **********************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class,1);

            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");


//
        }
        finally {
            session.close();
            factory.close();
        }
    }
}

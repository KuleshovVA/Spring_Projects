package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            Department dep = new Department("Sales", 1000000, 100);
//
//            Employee emp1 = new Employee("Vitaly", "Kuleshov", 100000);
//            Employee emp2 = new Employee("Misha", "Ivanov", 10000);
//            Employee emp3 = new Employee("MAnton", "Sidorob", 15000);
//
//            dep.addEmployeeToDepartmant(emp1);
//            dep.addEmployeeToDepartmant(emp2);
//            dep.addEmployeeToDepartmant(emp3);
//            session.beginTransaction();
//
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//// **********************************************************
//
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get departmanet");
            Department department = session.get(Department.class,3);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Get workers!");
            department.getEmps().get(0);

            session.getTransaction().commit();
            System.out.println("Show employees of department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
//
// **********************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//
        }
        finally {
            session.close();
            factory.close();
        }
    }
}

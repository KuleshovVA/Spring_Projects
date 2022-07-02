package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure( new File("/home/lord/IdeaProjects/Spring_course/src/main/java/hibernate.cfg.xml"))
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();


        Session session = null;

        try{
//            session = factory.getCurrentSession();

//            Section section1 = new Section("Yoga");
//
//            Child child1 = new Child("Derrick", 8);
//            Child child2 = new Child("LeBron", 10);
//            Child child3 = new Child("Magic", 21);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//
//
//            session.persist(section1);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
////

            //***********************************************************8


//
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Basketball");
//            Section section2 = new Section("Gym");
//            Section section3 = new Section("RespProcedure");
//
//            Child child1 = new Child("Luka", 8);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//
//
//            session.save(child1);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*****************************************************************
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child1 = session.get(Child.class, 1);
//
//            System.out.println(child1);
//            System.out.println(child1.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //*****************************************************************
            //
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 2);
//
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 6);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//            ********************************************

            session = factory.getCurrentSession();

            session.beginTransaction();

           Child child = session.get(Child.class,1);

           session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}

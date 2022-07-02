package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("VAKuleshov", 3, 4.3 );
        Student st2 = new Student("IIIvanov", 2, 3.3 );
        Student st3 = new Student("PPPetrov",  1, 2.3 );
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information of method getStudents:");
        System.out.println(students);
        return students;
    }
}

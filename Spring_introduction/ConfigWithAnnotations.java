package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}

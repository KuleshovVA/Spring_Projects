package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();

    }
}

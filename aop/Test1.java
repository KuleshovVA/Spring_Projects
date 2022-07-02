package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        unilibrary.getBook();
        unilibrary.addBook("Vitaly", book);
        unilibrary.addMagazine();
//        unilibrary.returnMagazine();
//        unilibrary.addBook();


//        unilibrary.returnBook();
//        unilibrary.getMagazine();

//        SchoolLibrary schoollibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoollibrary.getBook();

        context.close();
    }
}

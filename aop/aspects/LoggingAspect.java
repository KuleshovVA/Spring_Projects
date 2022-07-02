package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Aspect
@Order(1)
public class LoggingAspect {



//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazinefromUniLibrary(){}
//
//
//
//    @Before("allMethodsExceptReturnMagazinefromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log#10");
//    }
//
//
//






//    @Pointcut("execution(* aop.UniLibrary.get*())")
//        private void allGetMethodsFromUniLibrary(){}
//
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//
//    }
//
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("allReturnMethodsForUniLibrary: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice (){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
//    }
//
//
//
//
//
//
//








    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint)
    {

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());



        if(methodSignature.getName().equals("addBook"))
        {
            Object[] argimetns = joinPoint.getArgs();
            for (Object obj : argimetns)
            {
                if (obj instanceof aop.Book){
                    Book myBook = (Book) obj;
                    System.out.println("Инофрмация о книге: название книги - " +
                    myBook.getName() + "автор - " + myBook.getAuthor() + "год издания - " + myBook.getYearOfPulbication());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет  " + obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: логирование " +
                "попытки получить книгу/журнал");
        System.out.println("-----------------------------------------------");

    }

}

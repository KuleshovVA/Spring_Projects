package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: someone try put book back in UniLibrary");

        Object targetMethodResult = null;
        try {
             targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение" + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: someone put book back in UniLibrary success!");

        return targetMethodResult;
    }
}

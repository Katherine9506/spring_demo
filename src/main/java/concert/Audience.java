package concert;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {
    }

//    @Around("performance()")
//    public void watchPerformance(ProceedingJoinPoint joinPoint) {
//        try {
//            System.out.println("Silencing cell phones");
//            System.out.println("Taking seats");
//            joinPoint.proceed();
//            System.out.println("CLAP CLAP CLAP");
//            for (int i = 0; i < 10000; i++) {
//                System.out.println(i);
//            }
//        } catch (Throwable e) {
//            System.out.println("Demanding a refund");
//        }
//    }

    @AfterThrowing("performance()")
    public void throwing() {
        System.out.println("after-throwing advice");
    }

    @Before("performance()")
    public void before() {
        System.out.println("before advice");
    }

    @AfterReturning("performance()")
    public void returning() {
        System.out.println("after-returning advice");
    }

    @After("performance()")
    public void after() {
        System.out.println("after advice");
    }


}









































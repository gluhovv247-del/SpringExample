package sorokin.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* sorokin.example.taskManager.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint){
//        System.out.println("Перед вызовом метода: " +
//                joinPoint.getSignature().getName());
//
//    }
//    @AfterReturning(
//            value = "execution(* sorokin.example.taskManager.TaskManager.*(..))",
//            returning = "result"
//    )
//    public void logAfterReturning(
//            JoinPoint joinPoint, Object result
//    ){
//        System.out.println("После вызова метода: " +
//                joinPoint.getSignature().getName() + "результат= " + result);
//
//    }
//
//    @AfterThrowing(
//            value = "execution(* sorokin.example.taskManager.TaskManager.*(..))",
//            throwing = "exc"
//    )
//    public void afterThrowing(JoinPoint joinPoint, Exception exc){
//        System.out.println("После исключения: " + exc.getMessage());
//    }
//
////    @After("execution(* sorokin.example.taskManager.TaskManager.*(..))")
////    public void after(JoinPoint joinPoint){
////        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
////    }
//
//    @Around("execution(* sorokin.example.taskManager.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("До вызова метода");
//        Object result = proceedingJoinPoint.proceed();
//        System.out.println("После выполнения метода");
//        return result;
//    }
    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint,
                    Loggable loggable){
        for(int i = 0; i<loggable.quantity(); i++) {
            System.out.printf("LOG %s: Before method= %s\n",
                    loggable.value(),
                    joinPoint.getSignature().getName());
        }
    }

}

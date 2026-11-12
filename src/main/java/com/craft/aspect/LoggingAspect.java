package com.craft.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {


    @Pointcut("execution(* com.craft.service.Calculator.*(..))")
    public void calculatorMethods() {}


    @Before("calculatorMethods()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP - @Before] Calling method: " + joinPoint.getSignature().getName() + " with args: " + Arrays.toString(joinPoint.getArgs()));
    }


    @AfterReturning(pointcut = "calculatorMethods()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("[AOP - @AfterReturning] Method returned: " + result);
    }


    @AfterThrowing(pointcut = "calculatorMethods()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("[AOP - @AfterThrowing] Exception caught: " + exception.getMessage());
    }


    @After("calculatorMethods()")
    public void logAfterFinally(JoinPoint joinPoint) {
        System.out.println("[AOP - @After] Finished executing: " + joinPoint.getSignature().getName());
    }


    @Around("calculatorMethods()")
    public Object measureExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = pjp.proceed(); // Proceeds with actual execution
        long time = System.currentTimeMillis() - start;
        System.out.println("[AOP - @Around] Execution time: " + time + " ms");
        return result;
    }
}

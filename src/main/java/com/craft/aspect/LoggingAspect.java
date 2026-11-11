package com.craft.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // This runs BEFORE any method inside the Calculator class is executed
    @Before("execution(* com.craft.service.Calculator.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("==========================================");
        System.out.println("[AOP LOG] Intercepted method: " + joinPoint.getSignature().getName());
        System.out.println("==========================================");
    }
}
package com.example.dz3_MTS.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.time.Instant;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example..*Controller.*(..))")
    public void logMethodName(org.aspectj.lang.JoinPoint joinPoint) {
        System.out.println("Method called: " + joinPoint.getSignature().getName());
    }

    @Around("execution(* com.example..*Controller.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant end = Instant.now();
        System.out.println("Execution time: " + java.time.Duration.between(start, end).toMillis() + "ms");
        return result;
    }
}
package com.example.systemsplayground.aspects.logging.data;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DataSeederLoggingAspect {

    @Around("execution(* com.example.systemsplayground.data.DataSeeder.initDataBase(..))")
    Object logGetUserExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Adding mock data");

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - startTime;

        log.info("Completed adding mock data | Execution time: {} ms", elapsedTime);

        return result;
    }
}

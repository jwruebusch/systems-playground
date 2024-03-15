package com.example.systemsplayground.aspects.logging.services;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserServiceLoggingAspect {

    @Around("execution(* com.example.systemsplayground.services.UserService..*(..))")
    public Object logGetUserExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Entering method: " + joinPoint.getSignature());

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - startTime;

        log.info("Exiting method: " + joinPoint.getSignature()
            + " with return value: " + result + " | Execution time: "
            + elapsedTime + "ms");

        return result;
    }
}

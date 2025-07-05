// Placeholder for LoggingAspect.java in Exercise8_BasicAOP
package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("▶ Before method: " + joinPoint.getSignature());

        Object result = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("⏱ After method: " + joinPoint.getSignature() + ", executed in " + timeTaken + "ms");

        return result;
    }
}

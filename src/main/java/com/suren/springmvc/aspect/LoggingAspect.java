package com.suren.springmvc.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect{

    public static final Logger logger = Logger.getLogger(LoggingAspect.class);
    @Before("execution(* com.suren.springmvc.service.EmployeeService.updateEmployee(..))")
    public void logBefore(JoinPoint joinPoint) {

        logger.debug("logBefore() is running!");
        logger.debug("hijacked : " + joinPoint.getSignature().getName());
        logger.debug("******");
    }


    @After("execution(* com.suren.springmvc.service.EmployeeService.updateEmployee(..))")
    public void logAfter(JoinPoint joinPoint) {

        logger.debug("logAfter() is running!");
        logger.debug("hijacked : " + joinPoint.getSignature().getName());
        logger.debug("******");
    }

}




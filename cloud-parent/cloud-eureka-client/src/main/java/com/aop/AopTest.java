package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by tyhong on 2019/3/2.
 */
@Aspect
@Component
public class AopTest {
    @Pointcut("@annotation(com.a.anno)")
    public void ar(){}

    @Around("@annotation(com.a.anno)")
    public Object aaa(ProceedingJoinPoint joinPoint){
        System.out.printf("run start ...");
        Object o=null;
        //joinPoint.
        try {
            o=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return o;

    }


    @Around("@annotation(com.a.bbb)")
    public Object b(ProceedingJoinPoint joinPoint){
        System.out.printf("run start bbb...");
        Object o=null;
        //joinPoint.
        try {
            o=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return o;

    }
}

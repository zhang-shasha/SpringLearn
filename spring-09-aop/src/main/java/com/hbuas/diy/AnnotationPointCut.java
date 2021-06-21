package com.hbuas.diy;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//注解实现AOP
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.hbuas.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前--->");
    }
    @After("execution(* com.hbuas.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后--->");
    }
}

package com.example.annotation.aspect;

import com.example.annotation.annotations.LogOperator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.example.annotation.annotations.LogOperator)")
    public void saveLog() {
    }

    @Before("saveLog()")
    public void before(JoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        System.out.println("放法规则式拦截：" + method.getName());
    }

    @After("saveLog()")
    public void after(JoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        LogOperator logOperator = method.getAnnotation(LogOperator.class);
        System.out.println("注解式拦截：" + logOperator.desc());
    }

}

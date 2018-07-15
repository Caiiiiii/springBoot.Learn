package com.service.oneThreeThree;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    //PointCut注解声明切点
    @Pointcut("@annotation(com.service.oneThreeThree.Action)")
    public void annotationPointCut(){};
    //声明建言，并使用PointCut定义的切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature =
                (MethodSignature)joinPoint.getSignature();

        Method method = signature.getMethod();

        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截,"+action.name());
    }

    @Before("execution(* com.service.oneThreeThree.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则拦截,"+method.getName());
    }

}

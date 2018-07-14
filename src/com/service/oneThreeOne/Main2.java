package com.service.oneThreeOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config"));

        context.close();
    }
}

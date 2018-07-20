package com.service.TwoThreeTwo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * JSR250的形式创建Bean
 * */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造参数-JSR250WaySevice");
    }

    @PreDestroy
    public void Destroy(){
        System.out.println("jsr250-destroy-method");
    }
}

package com.service.TwoFourTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from devlopment profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBena(){
        return  new DemoBean("from production profile");
    }
}

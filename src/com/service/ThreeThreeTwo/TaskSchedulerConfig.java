package com.service.ThreeThreeTwo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.service.ThreeThreeTwo")
@EnableScheduling
public class TaskSchedulerConfig {
}

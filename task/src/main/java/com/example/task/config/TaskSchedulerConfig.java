package com.example.task.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.example.task.service")
@EnableScheduling
public class TaskSchedulerConfig {
}

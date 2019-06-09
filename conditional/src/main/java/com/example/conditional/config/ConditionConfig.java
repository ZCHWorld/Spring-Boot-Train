package com.example.conditional.config;

import com.example.conditional.conditional.LinuxCondition;
import com.example.conditional.conditional.WindowsCondition;
import com.example.conditional.service.LinuxListService;
import com.example.conditional.service.ListService;
import com.example.conditional.service.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}

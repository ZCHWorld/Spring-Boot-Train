package com.example.conditional;

import com.example.conditional.config.ConditionConfig;
import com.example.conditional.service.ListService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConditionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConditionalApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }

}

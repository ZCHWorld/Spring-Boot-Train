package com.example.annotation;

import com.example.annotation.config.LogConfig;
import com.example.annotation.service.LogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AnnotationApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LogConfig.class);
        LogService logService = context.getBean(LogService.class);
        logService.get();
        logService.post();
        logService.delete();
        logService.put();
        context.close();
    }

}

package com.spring_parc.example.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.spring_parc.example.a1")
public class DepInjectionAppLauncherApplication {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}

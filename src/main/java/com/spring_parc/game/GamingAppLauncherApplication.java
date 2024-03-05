package com.spring_parc.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring_parc.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
        System.out.println();
        System.out.println(context.getBean("packManGame"));
    }
}

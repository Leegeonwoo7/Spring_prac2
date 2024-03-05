package com.spring_parc.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("NinjaGameQualifier")
public class NinjaGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("bend down");
    }

    @Override
    public void left() {
        System.out.println("hide");
    }

    @Override
    public void right() {
        System.out.println("shoot");
    }
}

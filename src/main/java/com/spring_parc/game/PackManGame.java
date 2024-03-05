package com.spring_parc.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("up move");
    }

    @Override
    public void down() {
        System.out.println("down move");
    }

    @Override
    public void left() {
        System.out.println("left move");
    }

    @Override
    public void right() {
        System.out.println("right move");
    }
}

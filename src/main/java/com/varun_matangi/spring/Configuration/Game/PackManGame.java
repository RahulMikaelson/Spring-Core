package com.varun_matangi.spring.Configuration.Game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackManGame implements GameInterface{

    public void consoleOutPut(){
        System.out.println("PackMan Game is Running");
    }
}

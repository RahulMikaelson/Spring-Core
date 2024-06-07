package com.varun_matangi.spring.Configuration.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mario-game")
public class MarioGame implements GameInterface {
    public void consoleOutPut(){
        System.out.println("Mario Game is Running");
    }
}

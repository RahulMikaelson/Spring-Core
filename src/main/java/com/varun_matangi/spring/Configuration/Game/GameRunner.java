package com.varun_matangi.spring.Configuration.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GameRunner {
    public GameInterface gameInterface;

    @Autowired
    public GameRunner(@Qualifier("mario-game") GameInterface gameInterface) {
        this.gameInterface=gameInterface;
    }

    public void run(){
        this.gameInterface.consoleOutPut();
    }
}

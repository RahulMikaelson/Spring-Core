package com.varun_matangi.spring.Configuration.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class GameRunner {
    public GameInterface gameInterface;
    public GameRunner(GameInterface gameInterface) {
        this.gameInterface=gameInterface;
    }

    public void run(){
        this.gameInterface.consoleOutPut();
    }
}

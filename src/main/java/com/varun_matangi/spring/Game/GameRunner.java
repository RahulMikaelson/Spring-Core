package com.varun_matangi.spring.Game;

public class GameRunner {

    public GameInterface game;

    public GameRunner(GameInterface game) {
        this.game = game;
    }

    public void run(){
        this.game.consoleOutPut();
    }
}

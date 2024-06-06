package com.varun_matangi.spring.Game;

public class GameRunner {

    public MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run(){
        this.marioGame.consoleOutPut();
    }
}

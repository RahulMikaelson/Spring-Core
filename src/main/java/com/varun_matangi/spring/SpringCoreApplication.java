package com.varun_matangi.spring;

import com.varun_matangi.spring.Game.GameRunner;
import com.varun_matangi.spring.Game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		MarioGame marioGame = new MarioGame();
		GameRunner gameRunner =new GameRunner(marioGame);
		gameRunner.run();
	}

}

package com.varun_matangi.spring;

import com.varun_matangi.spring.Game.GameInterface;
import com.varun_matangi.spring.Game.GameRunner;
import com.varun_matangi.spring.Game.MarioGame;
import com.varun_matangi.spring.Game.PackManGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		GameInterface game = new PackManGame();
		GameRunner gameRunner =new GameRunner(game);
		gameRunner.run();
	}

}

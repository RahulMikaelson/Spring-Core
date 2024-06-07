package com.varun_matangi.spring;

import com.varun_matangi.spring.Configuration.Game.GameRunner;
import com.varun_matangi.spring.Configuration.GameConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		var context = new AnnotationConfigApplicationContext(GameConfig.class);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}

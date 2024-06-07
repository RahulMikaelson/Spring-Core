package com.varun_matangi.spring;

import com.varun_matangi.spring.Configuration.Game.GameRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		var context = new AnnotationConfigApplicationContext("com.varun_matangi.spring");
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}

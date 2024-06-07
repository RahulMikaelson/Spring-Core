package com.varun_matangi.spring.Configuration;

import com.varun_matangi.spring.Configuration.Game.GameInterface;
import com.varun_matangi.spring.Configuration.Game.GameRunner;
import com.varun_matangi.spring.Configuration.Game.MarioGame;
import com.varun_matangi.spring.Configuration.Game.PackManGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.varun_matangi.spring.Configuration")
public class GameConfig {

    @Bean
    public GameRunner gameRunner(@Qualifier("mario-game") GameInterface gameInterface){
        return new GameRunner(gameInterface);
    }

    @Bean
    @Qualifier("mario-game")
    public MarioGame marioGame(){
        return new MarioGame();
    }

    @Bean
    public PackManGame packManGame(){
        return new PackManGame();
    }
}

package com.gementar.learnspringframework;

import com.gementar.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration
{
    @Primary
    @Bean
    public GamingConsole game()
    {
        return new PacManGame();
    }

    @Primary
    @Bean
    public GameRunner gameRunner(GamingConsole game)
    {
        return  new GameRunner(game);
    }
}

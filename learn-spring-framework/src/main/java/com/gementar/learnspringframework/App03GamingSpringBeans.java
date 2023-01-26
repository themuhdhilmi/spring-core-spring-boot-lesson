package com.gementar.learnspringframework;

import com.gementar.learnspringframework.game.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans
{
    public static void main(String[] args)
    {
        try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class))
        {
            context.getBean(GamingConsole.class).right();
            context.getBean(GameRunner.class).run();
        };
    }
}

package com.gementar.learnspringframework;

import com.gementar.learnspringframework.game.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.gementar.learnspringframework.game")
public class GamingAppLauncherApplication
{
    public static void main(String[] args)
    {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class))
        {
            context.getBean(GamingConsole.class).right();
            context.getBean(GameRunner.class).run();
        }

    }
}

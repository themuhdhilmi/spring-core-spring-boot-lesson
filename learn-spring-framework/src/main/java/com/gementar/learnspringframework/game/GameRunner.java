package com.gementar.learnspringframework.game;

import com.gementar.learnspringframework.game.MarioGame;

public class GameRunner
{
    GamingConsole game;

    public GameRunner(GamingConsole game)
    {
        this.game = game;
    }

    public void run()
    {
        System.out.println("Running game : " + game);

        game.up();
        game.down();
        game.left();
        game.right();

    }
}

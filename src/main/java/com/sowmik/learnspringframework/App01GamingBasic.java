package com.sowmik.learnspringframework;

import com.sowmik.learnspringframework.game.GameRunner;
import com.sowmik.learnspringframework.game.PacmanGame;

public class App01GamingBasic {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame(); //1: Object Creation
        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a dependency of GameRunner
        gameRunner.run();
    }
}

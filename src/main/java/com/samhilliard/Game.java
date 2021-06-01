package com.samhilliard;

/**
 * General workflow of the pokemon battle game occurs here.
 * 
 * @author Sam Hilliard
 *
 */

public class Game {
    
    private boolean isRunning;

    public Game() {
        isRunning = true;
    }

    /**
     * Title string to be printed to the console to introduce the game.
     * @return String title of the game
     */
    public String titleScreen() {
        String titleText = "+-------------------------------+\n"
            + "| Pokemon CLI Battle simulator! |\n"
            + "+-------------------------------+\n\n";
        
        return titleText;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
package com.company;

//Project imports
import com.company.gui.JavaFXApp;
import com.company.gui.SwingApp;

/**
 * Main class where we start
 *
 * @author smsj
 */
public class Main {


    /**
     * Main start
     * @param args 
     */
    public static void main(String[] args)
    {
        //Swing version
        startSwingAppGame();

        //JavaFX version
        //startJavaFXGame();
    }

    /**
     * Start a JavaFX version of the game
     */
    private static void startJavaFXGame() {
        JavaFXApp.launch();
    }

    /**
     * Start a console version of the game
     */
    public static void startSwingAppGame() {
        new SwingApp().startGame();
    }
}




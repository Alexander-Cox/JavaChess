package com.alexander;

import javax.swing.*;

/**
 * Created by Xander on 18/02/2017.
 */
public class Game {

    //contains methods to loop through when game is active
    //e.g loop through to check if pieces need to be highlighted

    public void setupGame() {

        JFrame frame = new JFrame("Chess Time");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}

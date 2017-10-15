package ru.mboronin.display;

import javax.swing.*;
import java.awt.*;

/**
 * Represents application window
 * Created by mikeb on 2017-10-15.
 */
public class Display {
    private static boolean created = false; // check if the window is created
    private static JFrame window;
    private static Canvas content;

    public static void create (int width, int height, String title){
        if(created)
            return;
        // create a border
        window = new JFrame(title);
        // close the window on close button
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas();
        Dimension size = new Dimension(width,height);
        content.setPreferredSize(size);
        // user can't change size
        window.setResizable(false);
        window.getContentPane().add(content);
        // Change window size for the content
        window.pack();
        window.setLocationRelativeTo(null);
        // make window visible
        window.setVisible(true);

    }

}

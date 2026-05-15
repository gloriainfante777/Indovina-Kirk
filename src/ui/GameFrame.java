package ui;
import ui.GamePanel;

import javax.swing.*;
import java.awt.*;


public class GameFrame extends JFrame {

    public GameFrame() {


        setTitle("INDOVINA KIRK");


        setSize(1300, 800);


        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);


        setResizable(false);


        getContentPane().setBackground(Color.BLACK);

        setContentPane(new GamePanel());


        setVisible(true);
    }
}
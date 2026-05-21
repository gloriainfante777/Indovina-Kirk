package ui;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        setTitle("INDOVINA KIRK");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new GamePanel());
        setVisible(true);
    }
}
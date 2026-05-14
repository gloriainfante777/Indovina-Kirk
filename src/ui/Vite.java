package ui;

import javax.swing.*;
import java.awt.*;

public class Vite extends JPanel {
    private int lives = 3;

    public void loseLife() {
        lives--;

        switch (lives) {
            case 2:
                // TODO: animazione cappio
                break;
            case 1:
                // TODO: animazione coltellino
                break;
            case 0:
                // TODO: animazione proiettile + scritta “HAI PERSO”
                break;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Vite: " + lives, 10, 20);
    }
}


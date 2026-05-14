package ui;

import javax.swing.*;
import java.awt.*;

public class LifeSystem extends JPanel {

    private int vite = 3;

    public void perdiVita() {

        vite--;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.BOLD, 30));

        g.drawString("VITE: " + vite, 20, 40);
    }
}
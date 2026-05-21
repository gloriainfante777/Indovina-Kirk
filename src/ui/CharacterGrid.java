package ui;

import characters.CharacterCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CharacterGrid extends JPanel {

    private final List<CharacterCard> list;

    public CharacterCard selected;

    public CharacterGrid(List<CharacterCard> list) {
        this.list = list;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                int cols = 5;

                int size = Math.min(
                        getWidth() / cols,
                        getHeight() / ((list.size() / cols) + 1)
                );

                int col = e.getX() / size;
                int row = e.getY() / size;

                int i = row * cols + col;

                if (i >= 0 && i < list.size()) {
                    selected = list.get(i);
                    repaint();
                }
            }
        });
    }

    public void refresh() {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int cols = 5;

        int rows = (int) Math.ceil(list.size() / (double) cols);

        int size = Math.min(
                getWidth() / cols,
                getHeight() / rows
        );

        for (int i = 0; i < list.size(); i++) {

            CharacterCard c = list.get(i);

            int x = (i % cols) * size;
            int y = (i / cols) * size;

            // BOX
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, size - 2, size - 2);

            // NOME
            g.setColor(Color.BLACK);
            g.drawString(c.getNome(), x + 10, y + 20);

            // IMMAGINE
            if (c.getImmagine() != null) {
                g.drawImage(c.getImmagine(), x, y, size, size, null);
            }

            // ESCLUSIONE
            if (c.isEscluso()) {
                g.setColor(new Color(0, 0, 0, 180));
                g.fillRect(x, y, size, size);
            }

            // SELEZIONE
            if (c == selected) {
                g.setColor(Color.YELLOW);
                g.drawRect(x, y, size - 1, size - 1);
                g.drawRect(x + 1, y + 1, size - 3, size - 3);
            }
        }
    }
}
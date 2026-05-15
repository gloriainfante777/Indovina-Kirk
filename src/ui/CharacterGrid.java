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

    public CharacterGrid(List<CharacterCard> l) {

        list = l;

        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {

                int size = getWidth() / 5;

                int col = e.getX() / size;
                int row = e.getY() / size;

                int i = row * 5 + col;

                if (i >= list.size()) return;

                CharacterCard c = list.get(i);

                if (SwingUtilities.isLeftMouseButton(e))
                    selected = c;

                if (SwingUtilities.isRightMouseButton(e))
                    c.setEscluso(true);

                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int size = getWidth() / 5;

        for (int i = 0; i < list.size(); i++) {

            CharacterCard c = list.get(i);

            int x = (i % 5) * size;
            int y = (i / 5) * size;

            // 1. PERSONAGGIO
            if (c.getImmagine() != null) {
                g.drawImage(c.getImmagine(), x, y, size, size, null);
            }

            // 2. OVERLAY ESCLUSIONE
            if (c.isEscluso()) {
                g.setColor(new Color(0, 0, 0, 180));
                g.fillRect(x, y, size, size);
            }

            }
        }
    }
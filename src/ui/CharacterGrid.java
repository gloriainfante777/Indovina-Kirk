package ui;

import characters.CharacterCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CharacterGrid extends JPanel {

    private final int cellW = 140;   // 5:7 — aumentabili
    private final int cellH = 196;

    private final List<CharacterCard> characters;

    public CharacterCard selectedCharacter = null;

    public CharacterGrid(List<CharacterCard> chars) {
        this.characters = chars;

        setPreferredSize(new Dimension(5 * cellW, 5 * cellH));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                int col = e.getX() / cellW;
                int row = e.getY() / cellH;

                int index = row * 5 + col;
                if (index < 0 || index >= characters.size()) return;

                CharacterCard c = characters.get(index);

                if (e.getButton() == MouseEvent.BUTTON1) {
                    // Sinistro → seleziona il personaggio
                    selectedCharacter = c;

                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    // Destro → esclude (cadono le sbarre)
                    c.setExcluded(true);
                    // TODO: animazione sbarre + suono
                }

                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < characters.size(); i++) {
            CharacterCard c = characters.get(i);

            int col = i % 5;
            int row = i / 5;

            int x = col * cellW;
            int y = row * cellH;

            // TODO: se avete sprite: disegnare immagine del personaggio
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, cellW, cellH);

            g.setColor(Color.BLACK);
            g.drawString(c.getName(), x + 10, y + 20);

            if (c.isExcluded()) {
                g.setColor(new Color(0, 0, 0, 180));
                g.fillRect(x, y, cellW, cellH);
                // TODO: disegnare sbarre
            }
        }
    }
}

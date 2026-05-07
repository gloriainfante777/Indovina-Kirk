import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GamePanel extends JPanel {
    private BufferedImage[] ritratti = new BufferedImage[24];
    private BufferedImage cornice;

    private String[] nomi = {
            "laroccia", "carlo", "goffredo", "aldo", "beniamino", "giacomo", "raimondo", "benny",
            "nicola", "paolo", "silvio", "max", "blab", "giovanna", "elena", "michela",
            "parigia", "natalia", "elly", "leonarda", "barbara", "giulia", "lorenza", "rosa"
    };

    public GamePanel() {
        this.setPreferredSize(new Dimension(1920, 1080));
        this.setBackground(new Color(30, 30, 30));

        try {
            for (int i = 0; i < nomi.length; i++) {
                URL url = getClass().getResource("/characters/" + nomi[i] + ".png");
                if (url != null) {
                    ritratti[i] = ImageIO.read(url);
                }
            }

            URL urlCornice = getClass().getResource("/ui/cornice.png");
            if (urlCornice != null) {
                cornice = ImageIO.read(urlCornice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);

        int cardW = 150;
        int cardH = 188;
        int gap = 20;

        int larghezzaMatrice = (8 * cardW) + (7 * gap);

        int startX = 450;
        int startY = 140;

        for (int i = 0; i < ritratti.length; i++) {
            int col = i % 8;
            int row = i / 8;
            int x = startX + (col * (cardW + gap));
            int y = startY + (row * (cardH + gap));

            int paddingX = 6;
            int paddingY = 8;

            if (ritratti[i] != null) {
                g2d.drawImage(ritratti[i],
                        x + paddingX,
                        y + paddingY,
                        cardW - (paddingX * 2),
                        cardH - (paddingY * 2),
                        null);
            }

            if (cornice != null) {
                g2d.drawImage(cornice, x, y, cardW, cardH, null);
            }
        }

        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(Color.WHITE);

        // Personaggio Utente
        g2d.drawRect(80, 200, 280, 350);
        g2d.drawString("TU SEI:", 80, 190);

        // Vite
        for (int i = 0; i < 3; i++) {
            g2d.drawRect(80 + (i * 100), 580, 80, 80);
        }
        g2d.drawString("VITE", 80, 570);

        // Note
        int fineMatriceX = startX + larghezzaMatrice;
        g2d.drawRect(fineMatriceX - 400, 20, 400, 100);
        g2d.drawString("NOTE INVESTIGAZIONE", fineMatriceX - 400, 15);

        // Domande
        int domandaW = 420;
        for (int i = 0; i < 3; i++) {
            int xDomanda = startX + (i * (domandaW + 25));
            // Controlliamo che l'ultima domanda non esca dal bordo destro (1920)
            if (xDomanda + domandaW < 1900) {
                g2d.drawRect(xDomanda, 820, domandaW, 120);
            }
        }
        g2d.drawString("INTERROGA L'IA:", startX, 810);
    }
}
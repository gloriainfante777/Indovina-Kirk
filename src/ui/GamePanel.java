package ui;

import characters.CharacterCard;
import manager.*;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private CharacterGrid grid;
    private QuestionPanel qp;

    private final CharacterManager cm;
    private final QuestionManager qm;
    private final EliminazioneManager elim;

    public GamePanel() {

        setLayout(new BorderLayout());


        cm = new CharacterManager();
        qm = new QuestionManager();
        elim = new EliminazioneManager(cm.getTuttiPersonaggi());


        grid = new CharacterGrid(cm.getTuttiPersonaggi());


        qp = new QuestionPanel(
                qm.get3(),
                elim,
                this::updateGame
        );

        add(grid, BorderLayout.CENTER);
        add(qp, BorderLayout.EAST);
    }


    private void updateGame() {

        grid.refresh();

        refreshQuestions();

        checkEnd();
    }

    private void refreshQuestions() {

        remove(qp);

        qp = new QuestionPanel(
                qm.get3(),
                elim,
                this::updateGame
        );

        add(qp, BorderLayout.EAST);

        revalidate();
        repaint();
    }


    private void checkEnd() {

        if (elim.rimasti() == 1) {
            showFinal();
        }
    }


    private void showFinal() {

        removeAll();

        CharacterCard last = elim.ultimoRimasto();

        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(
                "Il personaggio è questo?",
                SwingConstants.CENTER
        );

        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        center.add(Box.createVerticalStrut(20));
        center.add(label);
        center.add(Box.createVerticalStrut(20));

        // FOTO PERSONAGGIO
        if (last != null && last.getImmagine() != null) {

            Image img = last.getImmagine()
                    .getScaledInstance(300, 300, Image.SCALE_SMOOTH);

            JLabel foto = new JLabel(new ImageIcon(img));

            foto.setAlignmentX(Component.CENTER_ALIGNMENT);

            center.add(foto);
        }

        center.add(Box.createVerticalStrut(20));

        // BOTTONI
        JButton si = new JButton("SI");
        JButton no = new JButton("NO");

        si.setFont(new Font("Arial", Font.BOLD, 20));
        no.setFont(new Font("Arial", Font.BOLD, 20));

        si.addActionListener(e -> showResult(true));
        no.addActionListener(e -> showResult(false));

        JPanel bottom = new JPanel();

        bottom.add(si);
        bottom.add(no);

        setLayout(new BorderLayout());

        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }


    private void showResult(boolean ok) {

        removeAll();

        JLabel result;

        if (ok) {
            result = new JLabel("INDOVINATO!", SwingConstants.CENTER);
        } else {
            result = new JLabel("COGLIONE!", SwingConstants.CENTER);
        }

        result.setFont(new Font("Arial", Font.BOLD, 60));

        setLayout(new BorderLayout());
        add(result, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}
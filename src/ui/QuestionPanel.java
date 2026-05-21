package ui;

import manager.EliminazioneManager;
import manager.Domanda;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class QuestionPanel extends JPanel {

    public QuestionPanel(List<Domanda> domande,
                         EliminazioneManager elim,
                         Runnable onUpdate) {

        setLayout(new GridLayout(3, 1));

        for (Domanda d : domande) {

            JPanel row = new JPanel();

            JLabel label = new JLabel(d.getTesto());

            JButton si = new JButton("SI");
            JButton no = new JButton("NO");

            si.addActionListener(e -> {
                elim.apply(d.getTratto(), true);
                onUpdate.run(); // 🔥 aggiorna GamePanel
            });

            no.addActionListener(e -> {
                elim.apply(d.getTratto(), false);
                onUpdate.run(); // 🔥 aggiorna GamePanel
            });

            row.add(label);
            row.add(si);
            row.add(no);

            add(row);
        }
    }
}
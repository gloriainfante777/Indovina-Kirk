package ui;

import manager.Domanda;
import manager.QuestionManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class QuestionPanel extends JPanel {

    private final JButton[] bottoni =
            new JButton[3];

    public QuestionPanel(QuestionManager manager) {

        setLayout(
                new GridLayout(3,1,10,10)
        );

        setPreferredSize(
                new Dimension(300,500)
        );

        generaBottoni(manager);
    }

    private void generaBottoni(
            QuestionManager manager) {

        List<Domanda> domande =
                manager.generaTreDomande();

        for(int i = 0;
            i < domande.size();
            i++) {

            Domanda domanda =
                    domande.get(i);

            JButton bottone =
                    new JButton(
                            domanda.getTesto()
                    );

            bottone.setFocusPainted(false);

            bottone.setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            16
                    )
            );

            bottoni[i] = bottone;

            add(bottone);
        }
    }
}
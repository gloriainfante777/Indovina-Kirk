package ui;

import manager.Domanda;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class QuestionPanel extends JPanel {

    public QuestionPanel(List<Domanda> domande) {

        setLayout(new GridLayout(3, 1));

        for (Domanda d : domande) {

            JButton btn = new JButton(d.getTesto());

            btn.addActionListener(e -> {

                System.out.println("DOMANDA: " + d.getTesto());

            });

            add(btn);
        }
    }
}
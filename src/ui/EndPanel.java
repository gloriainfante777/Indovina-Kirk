package ui;

import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel {

    public EndPanel(String text) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 60));

        add(label, BorderLayout.CENTER);
    }
}

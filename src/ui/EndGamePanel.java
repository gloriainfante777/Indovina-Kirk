package ui;



import javax.swing.*;
import java.awt.*;

public class EndGamePanel extends JPanel {

    public EndGamePanel(String testo) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel(testo, SwingConstants.CENTER);

        label.setFont(new Font("Arial", Font.BOLD, 40));

        add(label, BorderLayout.CENTER);
    }
}
package ui;

import javax.swing.*;
import java.awt.*;

public class NotesPanel extends JPanel {

    private final JTextArea areaNote;

    public NotesPanel() {

        setLayout(new BorderLayout());

        JLabel titolo =
                new JLabel("NOTE");

        titolo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        areaNote = new JTextArea();

        areaNote.setLineWrap(true);

        areaNote.setWrapStyleWord(true);

        JScrollPane scroll =
                new JScrollPane(areaNote);

        add(titolo, BorderLayout.NORTH);

        add(scroll, BorderLayout.CENTER);

        setPreferredSize(
                new Dimension(1200, 180)
        );
    }

    public String getTestoNote() {
        return areaNote.getText();
    }
}

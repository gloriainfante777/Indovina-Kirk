package ui;


import audio.AudioManager;
import manager.CharacterManager;
import manager.GameManager;
import manager.QuestionManager;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final CharacterManager characterManager;

    private final QuestionManager questionManager;

    private final GameManager gameManager;

    private final CharacterGrid griglia;

    private final QuestionPanel pannelloDomande;

    private final NotesPanel pannelloNote;

    private final LifeSystem sistemaVite;

    public GamePanel() {

        setLayout(new BorderLayout());

        // Manager
        characterManager =
                new CharacterManager();

        questionManager =
                new QuestionManager();

        gameManager =
                new GameManager();

        // Componenti
        griglia =
                new CharacterGrid(
                        characterManager.getTuttiPersonaggi()
                );

        pannelloDomande =
                new QuestionPanel(
                        questionManager
                );

        pannelloNote =
                new NotesPanel();

        sistemaVite =
                new LifeSystem();

        // Aggiunta componenti
        add(sistemaVite,
                BorderLayout.NORTH);

        add(griglia,
                BorderLayout.CENTER);

        add(pannelloDomande,
                BorderLayout.EAST);

        add(pannelloNote,
                BorderLayout.SOUTH);

        // Musica ambiente
        AudioManager.riproduciMusicaLoop(
                "assets/audio/prigione.wav"
        );
    }
}
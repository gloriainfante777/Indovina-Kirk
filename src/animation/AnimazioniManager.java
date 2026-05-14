package animation;

import audio.AudioManager;
import javax.swing.*;

public class AnimazioniManager {

    public static void cappio(JPanel panel) {

        AudioManager.play("resources/audio/cappio.wav");

        JOptionPane.showMessageDialog(panel,
                "Il cuore si secca lentamente...");
    }

    public static void coltello(JPanel panel) {

        AudioManager.play("resources/audio/knife.wav");

        JOptionPane.showMessageDialog(panel,
                "Colpo invisibile...");
    }

    public static void pistola(JPanel panel, String nome) {

        AudioManager.play("resources/audio/gun.wav");

        JOptionPane.showMessageDialog(panel,
                "HAI PERSO! " + nome + " è scappato");
    }
}
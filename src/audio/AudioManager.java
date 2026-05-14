package audio;

import javax.sound.sampled.*;
import java.io.File;

public class AudioManager {

    private static Clip musicaBackground;

    // Riproduce un suono singolo
    public static void riproduciSuono(String path) {

        try {

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(
                            new File(path)
                    );

            Clip clip = AudioSystem.getClip();

            clip.open(audio);

            clip.start();

        } catch (Exception e) {

            System.out.println("Errore audio: " + path);
        }
    }

    // Riproduce musica in loop
    public static void riproduciMusicaLoop(String path) {

        try {

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(
                            new File(path)
                    );

            musicaBackground = AudioSystem.getClip();

            musicaBackground.open(audio);

            musicaBackground.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {

            System.out.println("Errore musica");
        }
    }

    public static void stopMusica() {

        if(musicaBackground != null) {
            musicaBackground.stop();
        }
    }
}

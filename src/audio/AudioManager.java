package audio;

import javax.sound.sampled.*;

public class AudioManager {

    private static Clip musica;

    public static void play(String path) {
        try {
            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(
                            AudioManager.class.getResource(path)
                    );

            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();

        } catch (Exception e) {
            System.out.println("Errore audio");
        }
    }

    public static void loop(String path) {
        try {
            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(
                            AudioManager.class.getResource(path)
                    );

            musica = AudioSystem.getClip();
            musica.open(audio);
            musica.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            System.out.println("Errore musica");
        }
    }

    public static void stop() {
        if (musica != null) musica.stop();
    }
}

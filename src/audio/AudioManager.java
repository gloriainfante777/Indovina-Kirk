package audio;

import javax.sound.sampled.*;
import java.io.File;

    public class AudioManager {

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

                System.out.println("Errore audio");
            }
        }
    }
}

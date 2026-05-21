package assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class ImageLoader {

    public static BufferedImage load(String path) {

        try {
            InputStream is = ImageLoader.class.getResourceAsStream(path);

            if (is == null) {
                System.out.println("IMMAGINE NON TROVATA: " + path);
                return null;
            }

            return ImageIO.read(is);

        } catch (Exception e) {
            System.out.println("ERRORE CARICAMENTO IMMAGINE: " + path);
            return null;
        }
    }
}
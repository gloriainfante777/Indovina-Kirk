package assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class ImageLoader {

    public static BufferedImage load(String path) {

        try {
            InputStream is =
                    ImageLoader.class.getResourceAsStream(path);

            if (is == null) return null;

            return ImageIO.read(is);

        } catch (Exception e) {

            return null;
        }
    }
}
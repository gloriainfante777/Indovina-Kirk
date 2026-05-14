package effects;



import java.awt.*;
import java.awt.image.BufferedImage;

public class CRTFilter {

    public static BufferedImage apply(BufferedImage img) {

        BufferedImage out =
                new BufferedImage(
                        img.getWidth(),
                        img.getHeight(),
                        BufferedImage.TYPE_INT_RGB
                );

        for (int y = 0; y < img.getHeight(); y++) {

            for (int x = 0; x < img.getWidth(); x++) {

                Color c = new Color(img.getRGB(x, y));

                int r = (int)(c.getRed() * 0.9);
                int g = (int)(c.getGreen() * 0.7);
                int b = (int)(c.getBlue() * 0.9);

                out.setRGB(x, y, new Color(r,g,b).getRGB());
            }
        }

        return out;
    }
}
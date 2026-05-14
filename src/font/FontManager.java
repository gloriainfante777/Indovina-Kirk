package font;

import java.awt.*;
import java.io.File;

public class FontManager {

    private static Font font;

    public static void load() {

        try {
            font = Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("resources/font/indovina.ttf")
            );

        } catch (Exception e) {
            font = new Font("Arial", Font.BOLD, 18);
        }
    }

    public static Font get(int size) {
        return font.deriveFont(Font.BOLD, (float) size);
    }
}
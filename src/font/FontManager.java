package font;

import java.awt.*;

public class FontManager {

    private static Font font;

    public static void load() {
        try {
            font = Font.createFont(
                    Font.TRUETYPE_FONT,
                    FontManager.class.getResourceAsStream("/font/indovina.ttf")
            );
        } catch (Exception e) {
            font = new Font("Arial", Font.BOLD, 18);
        }
    }

    public static Font get(int size) {
        return font.deriveFont(Font.BOLD, size);
    }
}
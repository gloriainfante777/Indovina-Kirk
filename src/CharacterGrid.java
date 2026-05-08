package ui;
import characters.CharacterCard;
import java.util.List;

public class CharacterGrid {
    private final  int cellW = 140;   // 5:7 — aumentabili
    private final int cellH = 196;

    private final List<CharacterCard> characters;

    public CharacterCard selectedCharacter = null;

}

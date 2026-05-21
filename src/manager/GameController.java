package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.List;
import java.util.Random;

public class GameController {

    private final EliminazioneManager elim;
    private final CharacterCard secret;
    private Runnable onUpdate;

    public GameController(List<CharacterCard> list) {

        this.elim = new EliminazioneManager(list);

        this.secret = list.get(new Random().nextInt(list.size()));
    }

    public void setOnUpdate(Runnable r) {
        this.onUpdate = r;
    }

    public CharacterCard getSecret() {
        return secret;
    }

    public void playerAnswer(Tratti t, boolean si) {
        elim.apply(t, si);
        if (onUpdate != null) onUpdate.run();
    }

    public void iaTurn() {

        Tratti t = Tratti.values()[new Random().nextInt(Tratti.values().length)];
        boolean answer = secret.haTratto(t);

        elim.apply(t, answer);

        if (onUpdate != null) onUpdate.run();
    }

    public boolean isCorrectGuess(CharacterCard c) {
        return c == secret;
    }
    public boolean tryGuess(CharacterCard c) {
        return c == secret;
    }
}
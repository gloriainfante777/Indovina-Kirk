package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.*;

public class IAController {

    private final List<CharacterCard> possible;
    private final Random r = new Random();

    public IAController(List<CharacterCard> list) {
        this.possible = list;
    }


    public Tratti chooseBestTrait() {

        Map<Tratti, Integer> count = new HashMap<>();

        for (CharacterCard c : possible) {

            if (c.isEscluso()) continue;

            for (Tratti t : Tratti.values()) {

                if (c.haTratto(t)) {
                    count.put(t, count.getOrDefault(t, 0) + 1);
                }
            }
        }

        return count.entrySet()
                .stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(Tratti.GIOVANE);
    }


    public boolean answer(CharacterCard secret, Tratti t) {
        return secret.haTratto(t);
    }
}
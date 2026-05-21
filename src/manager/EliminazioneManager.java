package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.List;

public class EliminazioneManager {

    private final List<CharacterCard> list;

    public EliminazioneManager(List<CharacterCard> list) {
        this.list = list;
    }

    public void apply(Tratti t, boolean si) {

        for (CharacterCard c : list) {

            if (c.isEscluso()) continue;

            if (si && !c.haTratto(t)) c.setEscluso(true);
            if (!si && c.haTratto(t)) c.setEscluso(true);
        }
    }

    public long rimasti() {
        return list.stream().filter(c -> !c.isEscluso()).count();
    }

    public CharacterCard ultimoRimasto() {
        return list.stream()
                .filter(c -> !c.isEscluso())
                .findFirst()
                .orElse(null);
    }
}
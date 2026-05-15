package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.List;

public class EliminazioneManager {

    // Lista completa dei personaggi
    private final List<CharacterCard> personaggi;


    public EliminazioneManager(List<CharacterCard> personaggi) {

        this.personaggi = personaggi;
    }


    public void eliminaSi(Tratti tratto) {

        for (CharacterCard c : personaggi) {

            // Se NON possiede il tratto  elimina
            if (!c.haTratto(tratto)) {

                c.setEscluso(true);
            }
        }
    }

    public void eliminaNo(Tratti tratto) {

        for (CharacterCard c : personaggi) {

            // Se possiede il tratto → eliminato
            if (c.haTratto(tratto)) {

                c.setEscluso(true);
            }
        }
    }

    public void resetEliminazioni() {

        for (CharacterCard c : personaggi) {

            c.setEscluso(false);
        }
    }

    public int getPersonaggiRimasti() {

        int count = 0;

        for (CharacterCard c : personaggi) {

            if (!c.isEscluso()) {

                count++;
            }
        }

        return count;
    }
}


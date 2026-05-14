package manager;



import characters.Tratti;

import java.util.*;

public class QuestionManager {

    private final List<Domanda> tutteDomande =
            new ArrayList<>();

    private final Set<Domanda> domandeUsate =
            new HashSet<>();

    public QuestionManager() {

        caricaDomande();
    }

    private void caricaDomande() {

        tutteDomande.add(new Domanda(
                "Ha i capelli scuri?",
                Tratti.CAPELLI_SCURI
        ));

        tutteDomande.add(new Domanda(
                "È pelato?",
                Tratti.PELATO
        ));

        tutteDomande.add(new Domanda(
                "Ha gli occhiali?",
                Tratti.OCCHIALI
        ));

        tutteDomande.add(new Domanda(
                "È visibilmente vecchio?",
                Tratti.VECCHIO
        ));

        tutteDomande.add(new Domanda(
                "Ha il naso grande?",
                Tratti.NASO_GRANDE
        ));
    }

    public List<Domanda> generaTreDomande() {

        List<Domanda> disponibili =
                new ArrayList<>();

        for(Domanda d : tutteDomande) {

            if(!domandeUsate.contains(d)) {
                disponibili.add(d);
            }
        }

        Collections.shuffle(disponibili);

        List<Domanda> risultato =
                new ArrayList<>();

        for(int i = 0;
            i < 3 && i < disponibili.size();
            i++) {

            Domanda d = disponibili.get(i);

            risultato.add(d);

            domandeUsate.add(d);
        }

        return risultato;
    }
}
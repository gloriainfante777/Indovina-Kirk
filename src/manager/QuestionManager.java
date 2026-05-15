package manager;

import characters.CharacterCard.Genere;
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
                "È un maschio?",
                Genere.MASCHIO
        ));

        tutteDomande.add(new Domanda(
                "È una femmina?",
                Genere.FEMMINA
        ));

        tutteDomande.add(new Domanda(
                "È vecchio?",
                Tratti.VECCHIO
        ));

        tutteDomande.add(new Domanda(
                "È giovane?",
                Tratti.GIOVANE
        ));

        tutteDomande.add(new Domanda(
                "Ha gli occhi scuri?",
                Tratti.OCCHI_SCURI
        ));

        tutteDomande.add(new Domanda(
                "Ha gli occhi azzurri?",
                Tratti.OCCHI_AZZURRI
        ));

        tutteDomande.add(new Domanda(
                "Ha gli occhiali?",
                Tratti.OCCHIALI
        ));

        tutteDomande.add(new Domanda(
                "Ha gli occhiali da sole?",
                Tratti.OCCHIALI_DA_SOLE
        ));

        tutteDomande.add(new Domanda(
                "È bianco?",
                Tratti.CARNAGIONE_BIANCA
        ));

        tutteDomande.add(new Domanda(
                "È neGro?",
                Tratti.CARNAGIONE_SCURA
        ));



        tutteDomande.add(new Domanda(
                "È pelato?",
                Tratti.PELATO
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli scuri?",
                Tratti.CAPELLI_SCURI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli chiari?",
                Tratti.CAPELLI_BIONDI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli neri?",
                Tratti.CAPELLI_SCURI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli biondi?",
                Tratti.CAPELLI_BIONDI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli rossi?",
                Tratti.CAPELLI_ROSSI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli lunghi?",
                Tratti.CAPELLI_LUNGHI
        ));

        tutteDomande.add(new Domanda(
                "Ha i capelli corti?",
                Tratti.CAPELLI_CORTI
        ));

        tutteDomande.add(new Domanda(
                "Ha la barba?",
                Tratti.BARBA
        ));

        tutteDomande.add(new Domanda(
                "Ha i baffi?",
                Tratti.BAFFI
        ));

        tutteDomande.add(new Domanda(
                "Ha le orecchie a sventola?",
                Tratti.ORECCHIE_A_SVENTOLA
        ));

        tutteDomande.add(new Domanda(
                "Ha le orecchie grandi?",
                Tratti.ORECCHIE_GRANDI
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
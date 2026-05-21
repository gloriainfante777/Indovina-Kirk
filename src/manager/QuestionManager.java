package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.*;

public class QuestionManager {

    private final List<Domanda> domande = new ArrayList<>();
    private final Set<Domanda> usate = new HashSet<>();

    public QuestionManager() {

        domande.add(new Domanda("È vecchio?", Tratti.VECCHIO));
        domande.add(new Domanda("È femmina?", Tratti.FEMMINA));
        domande.add(new Domanda("Ha gli occhi scuri?", Tratti.OCCHI_SCURI));
        domande.add(new Domanda("Ha occhi azzurri?", Tratti.OCCHI_AZZURRI));
        domande.add(new Domanda("Ha capelli scuri?", Tratti.CAPELLI_SCURI));
        domande.add(new Domanda("Ha capelli biondi?", Tratti.CAPELLI_BIONDI));
        domande.add(new Domanda("È pelato?", Tratti.PELATO));
        domande.add(new Domanda("Ha gli occhiali?", Tratti.OCCHIALI));
        domande.add(new Domanda("Ha i baffi?", Tratti.BAFFI));
        domande.add(new Domanda("Ha il naso grande?", Tratti.NASO_GRANDE));
        domande.add(new Domanda("ha i capelli lunghi?", Tratti.CAPELLI_LUNGHI));
        domande.add(new Domanda("ha la carnagione negra?", Tratti.CARNAGIONE_SCURA));
        domande.add(new Domanda("ha la carnagione ariana?", Tratti.CARNAGIONE_BIANCA));
        domande.add(new Domanda("è ebreo?", Tratti.EBREO));
        domande.add(new Domanda("è senza faccia?", Tratti.SENZAFACCIA));
        domande.add(new Domanda("ha i capelli rossi?", Tratti.CAPELLI_ROSSI));

    }

    public List<Domanda> get3() {

        List<Domanda> disponibili = new ArrayList<>();

        for (Domanda d : domande)
            if (!usate.contains(d)) disponibili.add(d);

        if (disponibili.size() < 3) {
            usate.clear();
            disponibili.addAll(domande);
        }

        Collections.shuffle(disponibili);

        List<Domanda> out = new ArrayList<>(disponibili.subList(0, 3));
        usate.addAll(out);

        return out;
    }

    public List<Domanda> generaTreDomande() {
        return get3();
    }
}
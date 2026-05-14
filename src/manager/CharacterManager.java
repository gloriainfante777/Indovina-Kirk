// ===============================
// PACKAGE: manager
// FILE: CharacterManager.java
// ===============================

package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static characters.CharacterCard.Genere.*;

public class CharacterManager {

    private final List<CharacterCard> tuttiPersonaggi =
            new ArrayList<>();

    private CharacterCard personaggioIA;

    private CharacterCard personaggioUtente;

    public CharacterManager() {

        caricaPersonaggi();

        scegliPersonaggioIA();
    }

    private void caricaPersonaggi() {

        tuttiPersonaggi.add(new CharacterCard(
                "Carlo",
                MASCHIO,
                Tratti.GIOVANE,
                Tratti.FERITA_COLLO,
                Tratti.CAPELLI_SCURI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Goffredo",
                MASCHIO,
                Tratti.VECCHIO,
                Tratti.CAPELLI_GRIGI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Elena",
                FEMMINA,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_CORTI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_AZZURRI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Michela",
                FEMMINA,
                Tratti.CARNAGIONE_SCURA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI
        ));
    }

    private void scegliPersonaggioIA() {

        Random random = new Random();

        personaggioIA = tuttiPersonaggi.get(
                random.nextInt(tuttiPersonaggi.size())
        );
    }

    public List<CharacterCard> getTuttiPersonaggi() {
        return tuttiPersonaggi;
    }

    public CharacterCard getPersonaggioIA() {
        return personaggioIA;
    }

    public void setPersonaggioUtente(
            CharacterCard personaggioUtente) {

        this.personaggioUtente = personaggioUtente;
    }

    public CharacterCard getPersonaggioUtente() {
        return personaggioUtente;
    }
}


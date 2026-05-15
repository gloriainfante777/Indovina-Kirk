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
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_GRIGI,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Aldo",
                MASCHIO,
                Tratti.VECCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIONDI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Beniamino",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIANCHI,
                Tratti.OCCHI_SCURI,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giacomo",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIANCHI,
                Tratti.VECCHIO,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Raimondo",
                MASCHIO,
                Tratti.PIZZETTO,
                Tratti.VECCHIO,
                Tratti.CAPELLI_SCURI,
                Tratti.OCCHIALI,
                Tratti.CARNAGIONE_BIANCA
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "LaRoccia",
                MASCHIO,
                Tratti.CARNAGIONE_SCURA,
                Tratti.PELATO,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Benny",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.PELATO,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Nicola",
                MASCHIO,
                Tratti.CARNAGIONE_SCURA,
                Tratti.BAFFI,
                Tratti.OCCHIALI_DA_SOLE,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Paolo",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_AZZURRI,
                Tratti.CAPELLI_SCURI,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Silvio",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.OCCHI_SCURI,
                Tratti.CAPELLI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Max",
                MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.PIZZETTO,
                Tratti.OCCHI_AZZURRI,
                Tratti.CAPELLI_BIONDI,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Blab",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giovanna",
                FEMMINA,
                Tratti.CAPELLI_SCURI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Elena",
                FEMMINA,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_CORTI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_AZZURRI,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Michela",
                FEMMINA,
                Tratti.CARNAGIONE_SCURA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Parigia",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHIALI_DA_SOLE,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Natalia",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Elly",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI,
                Tratti.NASO_GRANDE,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Leonarda",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Barbara",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giulia",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.GIOVANE,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Lorenza",
                FEMMINA,
                Tratti.CARNAGIONE_SCURA,
                Tratti.GIOVANE,
                Tratti.CAPELLI_ROSSI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Rosa",
                FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI
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


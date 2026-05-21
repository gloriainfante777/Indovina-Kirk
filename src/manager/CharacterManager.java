package manager;

import characters.CharacterCard;
import characters.Tratti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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
                Tratti.MASCHIO,
                Tratti.GIOVANE,
                Tratti.CAPELLI_SCURI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_SCURI,
                Tratti.CAPELLI_CORTI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Goffredo",
                Tratti.MASCHIO,
                Tratti.VECCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIANCHI,
                Tratti.NASO_GRANDE,
                Tratti.OCCHI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.EBREO,
                Tratti.BARBA
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Aldo",
                Tratti.MASCHIO,
                Tratti.VECCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIONDI,
                Tratti.OCCHI_SCURI,
                Tratti.CAPELLI_CORTI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Beniamino",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIANCHI,
                Tratti.OCCHI_SCURI,
                Tratti.VECCHIO,
                Tratti.NASO_GRANDE,
                Tratti.CAPELLI_CORTI,
                Tratti.EBREO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giacomo",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.PELATO,
                Tratti.VECCHIO,
                Tratti.NASO_GRANDE,
                Tratti.CAPELLI_CORTI,
                Tratti.EBREO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Raimondo",
                Tratti.MASCHIO,
                Tratti.BARBA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_SCURI,
                Tratti.OCCHIALI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.BAFFI,
                Tratti.CAPELLI_CORTI,
                Tratti.EBREO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "LaRoccia",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_SCURA,
                Tratti.PELATO,
                Tratti.GIOVANE,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Benny",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.PELATO,
                Tratti.VECCHIO
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Nicola",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_SCURA,
                Tratti.BAFFI,
                Tratti.OCCHIALI_DA_SOLE,
                Tratti.OCCHIALI,
                Tratti.VECCHIO,
                Tratti.CAPELLI_CORTI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Paolo",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_AZZURRI,
                Tratti.CAPELLI_SCURI,
                Tratti.GIOVANE,
                Tratti.BAFFI,
                Tratti.CAPELLI_CORTI
                ));

        tuttiPersonaggi.add(new CharacterCard(
                "Silvio",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.OCCHI_SCURI,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI

        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Max",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.BARBA,
                Tratti.OCCHI_AZZURRI,
                Tratti.CAPELLI_BIONDI,
                Tratti.GIOVANE,
                Tratti.CAPELLI_CORTI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Blab",
                Tratti.MASCHIO,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.SENZAFACCIA,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giovanna",
                Tratti.FEMMINA,
                Tratti.CAPELLI_SCURI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI,
                Tratti.VECCHIO,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Elena",
                Tratti.FEMMINA,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_CORTI,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.OCCHI_AZZURRI,
                Tratti.VECCHIO,
                Tratti.CAPELLI_CORTI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Michela",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_SCURA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.VECCHIO

        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Parigia",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHIALI_DA_SOLE,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Natalia",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.GIOVANE,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Elly",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI,
                Tratti.NASO_GRANDE,
                Tratti.GIOVANE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Leonarda",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_CORTI,
                Tratti.OCCHI_SCURI,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Barbara",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.VECCHIO,
                Tratti.CAPELLI_BIONDI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Giulia",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_BIANCA,
                Tratti.GIOVANE,
                Tratti.CAPELLI_SCURI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI,
                Tratti.NASO_GRANDE
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Lorenza",
                Tratti.FEMMINA,
                Tratti.CARNAGIONE_SCURA,
                Tratti.GIOVANE,
                Tratti.CAPELLI_ROSSI,
                Tratti.CAPELLI_LUNGHI,
                Tratti.OCCHI_SCURI
        ));

        tuttiPersonaggi.add(new CharacterCard(
                "Rosa",
                Tratti.FEMMINA,
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


package manager;
import characters.CharacterCard;

public class GameManager {
    private int viteUtente = 3;
    private int viteIA = 3;

    public boolean controllaRispostaIA(Domanda domanda,
                                       CharacterCard personaggioIA) {

        return personaggioIA.haTratto(
                domanda.getTratto()
        );
    }

    public void perdiVitaUtente() {
        viteUtente--;
    }

    public void perdiVitaIA() {
        viteIA--;
    }

    public int getViteUtente() {
        return viteUtente;
    }

    public int getViteIA() {
        return viteIA;
    }

    public boolean utenteHaPerso() {
        return viteUtente <= 0;
    }

    public boolean iaHaPerso() {
        return viteIA <= 0;
    }
}

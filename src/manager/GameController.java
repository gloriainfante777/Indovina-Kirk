package manager;


import characters.CharacterCard;
import characters.Tratti;

public class GameController {

    private final EliminazioneManager elim;

    private CharacterCard IA;
    private CharacterCard player;

    private int vitePlayer = 3;
    private int viteIA = 3;

    public GameController(CharacterCard ia, CharacterCard player,
                          EliminazioneManager e) {

        this.IA = ia;
        this.player = player;
        this.elim = e;
    }

    public void rispostaGiocatore(Tratti t, boolean si) {

        if (si) elim.eliminaNo(t);
        else elim.eliminaSi(t);
    }

    public void rispostaIA(Tratti t, boolean si) {

        if (si) elim.eliminaNo(t);
        else elim.eliminaSi(t);
    }

    public boolean guessIA(String nome) {
        if (IA.getNome().equals(nome)) return true;
        vitePlayer--;
        return false;
    }

    public boolean guessPlayer(String nome) {
        if (player.getNome().equals(nome)) return true;
        viteIA--;
        return false;
    }

    public boolean fine() {
        return viteIA <= 0 || vitePlayer <= 0;
    }
}
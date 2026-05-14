package characters;

public class CharacterCard {
    public void setExcluded(boolean b) {
    }

    public enum Genere {MASCHIO, FEMMINA}

    private final String nome;
    private final Genere genere;
    private final String[] tratti;
    private boolean excluded = false; //la sbarra caduta


    public CharacterCard(String nome, Genere genere, String... tratti) {
        if (nome == null || genere == null) {
            throw new IllegalArgumentException("personaggio non valido");
        }
        this.nome=nome;
        this.genere=genere;
        this.tratti=tratti;

    }

    public String getnome() {
        return nome;
    }

    public Genere getGenere() {
        return genere;
    }

    public String[] gettratti() {
        return tratti;
    }

    public boolean isExcluded() {
        return excluded;
    }

    public void isExcluded(boolean exluded) {
        this.excluded = excluded;
    }
}

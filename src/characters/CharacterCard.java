package characters;

public class CharacterCard {

    public enum Genere {
        MASCHIO,
        FEMMINA
    }

    private final String nome;
    private final Genere genere;
    private final Tratti[] tratti;

    private boolean excluded = false;

    public CharacterCard(String nome, Genere genere, Tratti... tratti) {

        if (nome == null || genere == null) {
            throw new IllegalArgumentException("personaggio non valido");
        }

        this.nome = nome;
        this.genere = genere;
        this.tratti = tratti;
    }

    public String getNome() {
        return nome;
    }

    public Genere getGenere() {
        return genere;
    }

    public Tratti[] getTratti() {
        return tratti;
    }

    public boolean isExcluded() {
        return excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }
}
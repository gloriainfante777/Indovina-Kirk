

package characters;

import java.util.HashSet;
import java.util.Set;

public class CharacterCard {

    public enum Genere {
        MASCHIO,
        FEMMINA
    }

    private final String nome;
    private final Genere genere;

    private final Set<Tratti> tratti;

    private boolean escluso = false;

    public CharacterCard(String nome, Genere genere, Tratti... tratti) {

        if(nome == null || genere == null) {
            throw new IllegalArgumentException("Personaggio non valido");
        }

        this.nome = nome;
        this.genere = genere;

        this.tratti = new HashSet<>();

        for(Tratti t : tratti) {
            this.tratti.add(t);
        }
    }

    public String getNome() {
        return nome;
    }

    public Genere getGenere() {
        return genere;
    }

    public Set<Tratti> getTratti() {
        return tratti;
    }

    public boolean hasTrait(Tratti trait) {
        return tratti.contains(trait);
    }

    public boolean isEscluso() {
        return escluso;
    }

    public void setEscluso(boolean escluso) {
        this.escluso = escluso;
    }
}

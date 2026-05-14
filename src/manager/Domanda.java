package manager;


import characters.Tratti;

public class Domanda {

    private final String testo;

    private final Tratti trattoAssociato;

    public Domanda(String testo,
                   Tratti trattoAssociato) {

        this.testo = testo;
        this.trattoAssociato = trattoAssociato;
    }

    public String getTesto() {
        return testo;
    }

    public Tratti getTrattoAssociato() {
        return trattoAssociato;
    }

    @Override
    public String toString() {
        return testo;
    }
}
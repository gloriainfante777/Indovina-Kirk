package manager;

import characters.Tratti;

public class Domanda {

    private final String testo;
    private final Tratti tratto;

    public Domanda(String t, Tratti tr) {
        this.testo = t;
        this.tratto = tr;
    }

    public String getTesto() { return testo; }
    public Tratti getTratto() { return tratto; }
}
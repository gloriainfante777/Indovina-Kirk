package characters;

import assets.ImageLoader;

import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

public class CharacterCard {

    private final String nome;

    private final Set<Tratti> tratti;

    private final BufferedImage immagine;

    private boolean escluso = false;

    public CharacterCard(String nome,
                         Tratti... t) {

        this.nome = nome;

        tratti = new HashSet<>();

        for (Tratti x : t) {
            tratti.add(x);
        }

        immagine = ImageLoader.load(
                "/characters/" +
                        nome.toLowerCase().replace(" ", "") +
                        ".png"
        );
    }

    public String getNome() {
        return nome;
    }

    public boolean haTratto(Tratti t) {
        return tratti.contains(t);
    }

    public boolean isEscluso() {
        return escluso;
    }

    public void setEscluso(boolean e) {
        escluso = e;
    }

    public BufferedImage getImmagine() {
        return immagine;
    }
}
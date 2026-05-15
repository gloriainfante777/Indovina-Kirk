package characters;

import assets.ImageLoader;

import java.awt.image.BufferedImage;
import java.text.Normalizer;
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

    private final BufferedImage immagine;


    public CharacterCard(String nome,
                         Genere genere,
                         Tratti... trattiInput) {

        this.nome = nome;
        this.genere = genere;

        tratti = new HashSet<>();

        for (Tratti t : trattiInput) {

            tratti.add(t);
        }

        immagine = caricaImmagine(nome);
    }

    private BufferedImage caricaImmagine(String nome) {

        String file = normalizza(nome);

        return ImageLoader.load("/characters/" + file + ".png");
    }


    private String normalizza(String s) {

        String n =
                Normalizer.normalize(s, Normalizer.Form.NFD);

        n = n.replaceAll(
                "[\\p{InCombiningDiacriticalMarks}]",
                ""
        );

        n = n.toLowerCase();
        n = n.replace(" ", "");

        return n;
    }


    public String getNome() {
        return nome;
    }

    public Genere getGenere() {
        return genere;
    }

    public BufferedImage getImmagine() {
        return immagine;
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
}
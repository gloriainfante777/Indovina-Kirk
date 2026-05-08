package manager;

import characters.CharacterCard;
import static characters.CharacterCard.Gender.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterManager {
    private final List<CharacterCard> allCharacters = new ArrayList<>();
    private CharacterCard aiCharacter;  //personaggio scelto dall'AI
    private CharacterCard userCharacter; //personaggio scelto dall'utente

    public CharacterManager(){
        loadCharacters();
        pickAICharacter();
    }
    private void loadCharacters(){
        allCharacters.add(new CharacterCard("Carlo", MASCHIO ,"visibilmente giovane", "ferita collo sinistra", "capelli scuri", "carnagione bianca", "occhi scuri"));
        allCharacters.add(new CharacterCard("Goffredo", MASCHIO , "visibilmente vecchio","carnagione bianca","capelli grigi", "mascella enorme", "labbro spaccato", "naso enorme"));
        allCharacters.add(new CharacterCard("Aldo", MASCHIO , "visibilmente vecchio","carnagione bianca", "capelli biondi pochi", "occhi scuri"));
        allCharacters.add(new CharacterCard("Beniamino ", MASCHIO,"carnagione bianca", "capelli bianchi", "occhi scuri", "visibilmente vecchio", "orecchie grandi", "faccia snella"));
        allCharacters.add(new CharacterCard("Giacomo", MASCHIO ,"carnagione bianca","capelli bianchi", "visibilmente vecchio","naso grande"));
        allCharacters.add(new CharacterCard("Raimondo", MASCHIO ,"pizzetto", "visibilmente vecchio","capelli scuri medi","paffuto","occhiali""carnagione bianca"));
        allCharacters.add(new CharacterCard("LaRoccia", MASCHIO ,"carnagione scura", "muscoloso","pelato","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Benny", MASCHIO, "carnagione bianca", "pelato","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Nicola", MASCHIO,"carnagione scura","baffi","cuffie","occhiali da sole","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Paolo", MASCHIO,"carnagione bianca","occhi azzurri","capelli scuri ","barba scura","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Silvio", MASCHIO,"carnagione bianca","visibilmente vecchio","occhi scuri","capelli scuri"));
        allCharacters.add(new CharacterCard("Max", MASCHIO,"carnagione bianca","pizzetto","occhi chiari","capelli chiari","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Blab", FEMMINA,"carnagione bianca","triplo mento","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Giovanna", FEMMINA,"caschetto nero","carnagione bianca","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Elena", FEMMINA,"carnagione bianca","occhi chiari","capelli corti","capelli biondi","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Michela", FEMMINA,"carnagione scura","capelli neri","capelli lunghi","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Parigia", FEMMINA,"carnagione bianca","capelli biondi","capelli lunghi","occhiali da sole","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Natalia", FEMMINA,"carnagione bianca","capelli marroni","capelli lunghi","botox alle labbra","visibilmente giovane"));
        allCharacters.add(new CharacterCard("Elly", FEMMINA,"carnagione bianca","capelli marroni","capelli corti","occhi scuri","naso lungo","visibilmente vecchio"));
        allCharacters.add(new CharacterCard("Leonarda ", FEMMINA,"carnagione bianca","visibilmente vecchia","capelli marroni","capelli corti","occhi scuri","naso lungo"));
        allCharacters.add(new CharacterCard("Barbara", FEMMINA,"carnagione bianca","visibilmente vecchia","capelli biondi","capelli lunghi","occhi scuri"));
        allCharacters.add(new CharacterCard("Giulia", FEMMINA,"carnagione bianca","visibilmente giovane","capelli scuri","capelli lunghi","occhi scuri","lentiggini"));
        allCharacters.add(new CharacterCard("Lorenza", FEMMINA,"carnagione scura","visibilmente giovane","capelli rossi","capelli lunghi","occhi scuri"));
        allCharacters.add(new CharacterCard("Rosa", FEMMINA,"carnagione bianca","visibilmente vecchia","capelli scuri","capelli corti","occhi scuri"));
    }
    private void pickAICharacter() {
        Random r = new Random();
        aiCharacter = allCharacters.get(r.nextInt(allCharacters.size()));
    }
    public CharacterCard getAICharacter() { return aiCharacter; }

    public List<CharacterCard> getAllCharacters() {
        return allCharacters;
    }
    public void setUserCharacter(CharacterCard c) {
        this.userCharacter = c;
    }

    public CharacterCard getUserCharacter() {
        return userCharacter; }
}





package manager;
import java.util.*;

public class Domande {

    private final List<String> tuttedomande = new ArrayList<>();
    private final Set <String> domandefatte = new HashSet<>();
    private final Random md = new Random();

    public Domande(){
        CaricaDomande();
    }

    public void CaricaDomande(){

        Collections.addAll(tuttedomande, "E' un maschio?", "E' una femmina?","E' vecchio?" , "E' vecchia?", "Ha gli occhiali?" , "Ha gli occhiali da sole?" , "E' ebreo?" , "Ha gli occhi scuri?", "Ha gli occhi chiari?", "E' negro?" , "E' bianco?", "ha i baffi?", "Ha la barba?" , "Ha le orecchie grandi?", "Ha i capelli?" , "Ha i capelli scuri?", "Ha i capelli chiari?" , "Ha i capelli lunghi?" , "Ha i capelli corti?", "Ha i capelli rossi?" , "Ha i capelli neri?", "Ha le lentiggini?", "Ha la faccia?");


    }
    public List<String> generaturnodomanda(){
        List<String> avaiable = new ArrayList<>();

        for (String q: tuttedomande){
            if (tuttedomande.contains(q)
        }
    }

}

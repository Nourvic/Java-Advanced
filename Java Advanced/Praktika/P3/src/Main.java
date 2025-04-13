import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Risiko> liste = new ArrayList();
        Risikoverwaltung rv = new Risikoverwaltung();
        Risiko akris = new AkzeptablesRisiko("Ahmad", 10, 300);
        Risiko akris2 = new AkzeptablesRisiko("Mohamad", 30, 300);
        // Risiko exris=new ExtremesRisiko("Wasserhahn",150,1000,"Akelkhara",1500);
        Risiko inris = new InakzeptablesRisiko("Abdo", 50, 50, "Normal");
        Risiko inris2 = new InakzeptablesRisiko("Zaid", 30, 50, "Normal");
        Risiko inris3 = new InakzeptablesRisiko("Walid", 20, 50, "Normal");

        rv.aufnehmen(akris);
        rv.aufnehmen(akris2);
        rv.aufnehmen(inris);
        rv.aufnehmen(inris2);
        rv.aufnehmen(inris3);


        rv.zeigeRisiken();


    }
}
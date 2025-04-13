import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Risikoverwaltung {

    private LinkedList<Risiko> dieRis;

    public Risikoverwaltung() {
        this.dieRis = new LinkedList<Risiko>();

    }

    public void aufnehmen(Risiko ris) {

        if (ris != null) {
            dieRis.add(ris);
        }

    }

    public void zeigeRisiken() {
     //  Collections.sort(dieRis,new Namenvergleich());
 //      dieRis.sort(new Namenvergleich());
     //  dieRis.sort(new Idvergleich());

       //Collections.sort(dieRis,new Idvergleich());
        //Iterator
        Iterator<Risiko> it = dieRis.iterator();
        while (it.hasNext()) {
            it.next().druckeDaten();
        }

    }


    public void sucheRisikoMitMaxRueckstekkung() {
        double max = dieRis.get(0).ermittleRueckstellung();
        int indextest = 0;
        for (int i = 0; i < dieRis.size(); i++) {
            if (dieRis.get(i).ermittleRueckstellung() > max) {
                max = dieRis.get(i).ermittleRueckstellung();
                indextest = i;
            }
        }
        dieRis.get(indextest).druckeDaten();

    }

    public float berechneSummeRueckstekkungen() {
        if (dieRis.isEmpty()) {
            return 0;
        }
        float sum = 0;
        for (Risiko ris : dieRis) {
            sum += ris.ermittleRueckstellung();
        }
        return sum;
    }
}

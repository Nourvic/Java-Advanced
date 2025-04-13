import java.util.LinkedList;
import java.util.List;

public class Conveyor {
    private Bottle bottle;
    private List<Bottle> liste;

    public Conveyor() {
        liste = new LinkedList<>();
    }

    public void load(Bottle b) {
        liste.add(b);
    }

    public Bottle withdraw() {
        return liste.remove(0);
    }

    public boolean isEmpty() {
        return liste.isEmpty();
    }

    public boolean isOverloaded() {
        return liste.size() > 50;
    }


}

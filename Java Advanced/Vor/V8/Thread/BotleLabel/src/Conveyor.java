import java.util.LinkedList;
import java.util.List;

public class Conveyor {

    private List<Bottle> bottles;

    public Conveyor() {
        bottles = new LinkedList<>();
    }

    public void load(Bottle b) {
        bottles.add(b);
    }

    public Bottle withdraw() {
        return bottles.remove(0);
    }

    public boolean isEmpty() {
        return bottles.isEmpty();
    }

    public boolean isOverloaded() {
        return bottles.size() > 50;
    }

}

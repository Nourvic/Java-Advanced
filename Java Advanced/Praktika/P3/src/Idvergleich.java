import java.util.Comparator;

public class Idvergleich implements Comparator<Risiko> {
    @Override
    public int compare(Risiko o1, Risiko o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

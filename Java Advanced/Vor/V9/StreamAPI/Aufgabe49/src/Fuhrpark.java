import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Fuhrpark {
    private List<Auto> autoliste;

    public Fuhrpark() {
        autoliste = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        autoliste.add(auto);
    }

    public boolean istHerstellerVorhanden(String hersteller) {
        return autoliste.stream().map(a -> a.getHersteller()).anyMatch(h -> h.equals(hersteller));
    }

    public Auto neustesBaujahr(String hersteller) {
        return autoliste.stream()
                .filter(a -> a.getHersteller().equals(hersteller))
                .max((a, b) -> Integer.compare(a.getBaujahr(), b.getBaujahr())).get();
    }

    public void druckeAutosmitBaujahr(int baujahr, int n) {
        autoliste.stream().filter(a -> a.getBaujahr() == baujahr).limit(n).forEach(System.out::println);
    }


}

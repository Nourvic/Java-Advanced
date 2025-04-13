import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Dealership {


    public static Optional<Car> mostExpensive(List<Car> liste) {
        return liste.stream().max((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }


    public static double totalPrice(List<Car> liste) {


        return liste.stream().map((e) -> e.getPrice()).reduce(0.0, (a, b) -> a + b);

        // BMW MERCEDES AUDI TESLA VW
        //  return liste.stream().mapToDouble((e) -> e.getPrice()).sum();
    }

    public static long totalNumberOf(List<Car> liste, Predicate<Car> p) {
        return liste.stream().filter(p).count();
        // return liste.stream().filter(p).count();
    }

}

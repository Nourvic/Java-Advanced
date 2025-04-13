import java.util.function.Predicate;

public class CarTsetPredicate implements Predicate<Car> {

    @Override
    public boolean test(Car car) {
        return car.getCarmaker().equals("Tesla");
    }
}

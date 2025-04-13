import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "m2", "red", 33000));
        cars.add(new Car("BMW", "m5", "black", 80000));
        cars.add(new Car("BMW", "e93", "red", 20000));
        cars.add(new Car("Tesla", "t1", "white", 45000));
        cars.add(new Car("Tesla", "t2", "black", 45000));
        cars.add(new Car("Tesla", "Cyber Truck", "grey", 45000));
        cars.add(new Car("Tesla", "Cyber Truck 2", "grey", 45000));
        cars.add(new Car("Tesla", "Cyber Truck 2", "grey", 45000));
        cars.add(new Car("Mercedes", "s63", "blue", 40000));
        cars.add(new Car("VW", "golf 5", "green", 50000));
        cars.add(new Car("Audi", "tt", "rosa", 60000));
        cars.add(new Car("KIA", "cerato", "yellow", 9000));

        Dealership dp = new Dealership();
        System.out.println("Most Expensive one is : " + dp.mostExpensive(cars).get().getCarmaker());
        System.out.println("Total Price is : " + dp.totalPrice(cars));
        System.out.println("Anzahl der Autos die bestimme P besitzen : " + dp.totalNumberOf(cars, (e) -> e.getCarmaker() == "BMW"));
        System.out.println("Anyahl der Autos mit dem Marke Tesla betragen " + dp.totalNumberOf(cars, new CarTsetPredicate()));
        //    System.out.println("Most Expensive one is : " + dp.mostExpensive(cars).get().getCarmaker());

    }
}
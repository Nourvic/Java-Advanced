import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Stream<Double> randomnum = Stream.generate(Math::random).limit(10);
        //  randomnum.forEach(System.out::println);
        //   randomnum.forEach(e -> System.out.println(e));
        Stream<Double> randomnum2 = Stream.generate(() -> {
          // System.out.println("Test");
            return Math.random();
        }).limit(5);

        randomnum2.forEach(System.out::println);

    }
}
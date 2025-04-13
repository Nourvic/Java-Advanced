import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToListExample {

    public static void main(String[] args) {
        Stream
                .of("Nour", "Ahmad", "Shaker", "Isreaa", "Omar", "Abdou", "sikor")
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("Nour");
                    }
                })
                .map(String::toUpperCase)// NOUR SHAKER OMAR SIKOR
                .collect(Collectors.toList())//samle alled Daten die werden noch bearbeitet
                .forEach(System.out::println);


        //Ohne Collector


        List<String> liste = Stream
                .of("Nour", "Ahmad", "Shaker", "Isreaa", "Omar", "Abdou", "sikor")
                .filter(e -> e.toLowerCase().endsWith("r"))
                .map(String::toUpperCase).collect(Collectors.toList());
                liste.forEach(System.out::println);


        // NOUR SHAKER OMAR SIKO
    }
}

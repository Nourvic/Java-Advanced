import java.util.Arrays;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        /*
        Stream.of(1, 2, 3, 4, 50, 22, 45, 23, 61, 56, 35, 61, 26, 9, 67, 99)
                .map(e -> e % 2 == 0).forEach(System.out::println);


        String[] words = {"Alaa", "Sobhi", "Jada", "Karima", "Nadya", "Zaid", "Hassna"};

        Stream<String> listWords = Arrays.stream(words);

        listWords
                .filter(e -> e.toLowerCase().endsWith("a"))
                .sorted()
                .forEach(e -> System.out.println(e)
                );


         */
        String[] filterWords = {"java", "c++", "javascript", "python"};
        Stream<String> feld = Stream.of(filterWords);

        System.out.println("feld Before : ");
       // feld.forEach(e -> System.out.println(e));
        feld.filter(e -> e.length() <= 4).map(String::toUpperCase).forEach(e -> System.out.println(e));

       // feld.forEach(System.out::println);

    }
}

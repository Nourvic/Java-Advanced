import java.util.*;
import java.util.stream.Stream;

public class MinMAXCountExample {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10));
        Optional<Integer> min = liste.stream().min((a, b) -> a - b);
        Optional<Integer> max = liste.stream().max(Integer::compare);
        //Optional<Integer> max = liste.stream().max(DOUBLE::);
        long count = liste.stream().count();
        //  System.out.println("Min: " + min.get());
        //    System.out.println("Max: " + max.get());
        //      System.out.println("Count: " + count);

        String[] filterWords = new String[]{"Nour", "c++", "a++", "javascript", "python", "azure"};
        //Count
        //    long feld = Stream.of(filterWords).map(s -> s.toLowerCase()).count();
        //    System.out.println("Count betraegt : " + feld);
        // Max
        Optional<String> var =
                // Stream.of(filterWords).map(s -> s.toLowerCase()).max((a, b) -> b.compareTo(a));
                Stream.of(filterWords).map(s -> s.toUpperCase()).max((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(var.get());

        Optional<String> var2 =
                Stream.of(filterWords).map(s -> s.toUpperCase()).filter(s -> s.contains("+")).min(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });
        System.out.println(var2.get());

        //findFirst

        Optional<String> var3=
                Stream.of(filterWords).map(s->s.toUpperCase()).findFirst();

        System.out.println(var3.get());



    }
}

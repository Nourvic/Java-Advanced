import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SearchingExample {

    public static void main(String[] args) {

        Integer[] feld = {1, 2, 3, 4, 5, 6, 8, 10};
        // Stream<Integer> strlist = Arrays.stream(array);

        // Deklarationen eines Streams
        //List<Integer> strlist2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> arrlist = new ArrayList<>(Arrays.asList(feld));
        //Stream<Integer> streamlist = arrlist.stream();
        //arrlist.stream().forEach(System.out::println);
        //strlist.forEach(System.out::println);


        boolean anyMatch = arrlist.stream().anyMatch(i -> i % 2 == 0);//
        boolean allMatch = arrlist.stream().allMatch(i -> i % 2 == 0);//
        boolean noneMatch = arrlist.stream().noneMatch(i -> i % 2 != 0);//
        boolean noneMatch2 = arrlist.stream().noneMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });//

        System.out.println("anyMatch: " + anyMatch);
        System.out.println("allMatch: " + allMatch);
        System.out.println("noneMatch: " + noneMatch);

    }
}

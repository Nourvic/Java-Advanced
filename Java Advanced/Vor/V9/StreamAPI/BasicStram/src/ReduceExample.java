import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {

        double[] array = {2, 4, 6, 8, 80};
        // double array2[] = {2,4,6,8};
        List<Integer> liste = new ArrayList<>(Arrays.asList(100, 900));
        Stream<Integer> streamL = liste.stream();
        int x = streamL.reduce(0, (a, b) -> a + b);
        System.out.println(x);
        //   streamL.forEach(e->System.out.println(e))
        //   System.out.println(list);
        //   System.out.println(Arrays.stream(array).reduce(Double::sum).getAsDouble());
        //   System.out.println(Arrays.stream(array).reduce(0, (a, b) -> a + b));


    }

}

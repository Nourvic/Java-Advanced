public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        TaschenrechnerAktion add = (a, b) -> {
            return a + b;
        };
        TaschenrechnerAktion add2 = (a, b) -> a + b;
        TaschenrechnerAktion sub = (i, j) -> i - j;
        TaschenrechnerAktion div = (x, y) -> x - y;
        TaschenrechnerAktion mul = (g, h) -> g * h;

        System.out.println(add.rechnen(10,20));
        System.out.println(sub.rechnen(10,20));
        System.out.println(div.rechnen(10,20));
        System.out.println(mul.rechnen(10,20));
        //  System.out.println(add(1,5));
    }
}


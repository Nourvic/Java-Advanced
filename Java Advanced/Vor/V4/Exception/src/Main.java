import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //  int g = scanner.nextInt();

        try {
            div(0, 5);
        } catch (ArithmeticException e) {
            System.out.println("Ameer was hier!!!!!!");
        }


    }



    public static int div(int a, int b) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException(" NOPE!");
        } else {
            return b / a;
        }
    }
}
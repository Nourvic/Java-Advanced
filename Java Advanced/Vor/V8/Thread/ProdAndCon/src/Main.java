import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lager = new LinkedList();
        Thread prothread = new Thread(new Producer(lager));
        Thread conthread = new Thread(new Consumer(lager));


        prothread.start();
        conthread.start();

    }
}
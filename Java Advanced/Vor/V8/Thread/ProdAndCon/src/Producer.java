import java.util.LinkedList;
import java.util.List;

public class Producer implements Runnable {


    private List<Integer> lager;


    public Producer(List<Integer> lager) {
        this.lager = lager;
    }

    @Override

    public void run() {
        int i = 0;
        while (i <= 100) {
            Integer item = new Integer(i++);
            System.out.println("Producer : " + item);
            synchronized (lager) {
                lager.add(item);
                lager.notifyAll();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

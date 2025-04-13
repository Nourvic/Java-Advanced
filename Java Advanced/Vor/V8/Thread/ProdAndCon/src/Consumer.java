import java.util.List;

public class Consumer implements Runnable {

    private List<Integer> lager ;


    public Consumer(List<Integer> lager) {
        this.lager = lager;
    }

    @Override

    public void run() {
        int sum = 0;
        while (sum != 5050) {
            try {
                synchronized (lager) {
                    while (lager.isEmpty()) {
                        System.out.println("Warte auf Zahl");
                        lager.wait();
                    }
                    sum += lager.remove(0);
                    System.out.println("Consumer: " + sum);
                    lager.notifyAll();
                }

                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }

        }
    }
}

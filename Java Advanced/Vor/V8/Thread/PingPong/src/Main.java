public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new PingPongModel("Ping", 1500));
        Thread t2 = new Thread(new PingPongModel("Pong", 1500));


        t1.start();
        t2.start();


        try {
            // Thread für 3 Sekunden laufen lassen
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread unterbrechen
        System.out.println("Thread wird unterbrochen...");
        t1.interrupt();
        t2.interrupt();

    }
}
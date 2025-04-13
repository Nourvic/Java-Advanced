public class Turnstile implements Runnable {
    private Counter c;
    private int delay;

    public Turnstile(Counter c, int delay) {
        this.c = c;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            try {

                synchronized (this) {
                    c.inc();
                }

                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.getMessage();
            }


        }
    }
}

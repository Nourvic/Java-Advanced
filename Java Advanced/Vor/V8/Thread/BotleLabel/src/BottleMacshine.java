public class BottleMacshine implements Runnable {
    private int delay;
    private Conveyor laufband;

    public BottleMacshine(Conveyor laufband, int delay) {
        this.laufband = laufband;
        this.delay = delay;
    }

    @Override
    public void run() {
        // Bottle bottle =  new Bottle(new )
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (laufband) {
                    while (laufband.isOverloaded()) {
                        laufband.wait();
                    }
                    laufband.load(new Bottle());
                    System.out.println("Abfuellanlage Neue Flasche abgefuellt");
                    laufband.notifyAll();
                }
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

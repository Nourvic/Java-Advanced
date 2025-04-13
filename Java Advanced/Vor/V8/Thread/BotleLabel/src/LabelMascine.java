public class LabelMascine implements Runnable {
    private int delay;
    private Conveyor laufband;


    public LabelMascine(Conveyor laufband, int delay) {
        this.laufband = laufband;
        this.delay = delay;

    }


    @Override
    public void run() {
        Bottle b;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (laufband) {
                    while (laufband.isEmpty()) {
                        laufband.wait();
                        System.out.println("Warten, da Foerderband leer");
                    }
                    b = laufband.withdraw();
                    laufband.notifyAll();
                }
                b.setLabel(new Label("Cola", 2025));
                System.out.print("EtikettierMaschine ");
                b.printLabel();
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

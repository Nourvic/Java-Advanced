public class BottlingPlant implements Runnable {
    private Conveyor conveyor;


    public BottlingPlant(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (conveyor) {
                    while (conveyor.isOverloaded()) {
                        conveyor.wait();
                    }
                    conveyor.load(new Bottle());
                    System.out.println("Abfuellanlage: Neue Flasche abgefuellt");
                    conveyor.notifyAll();

                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


}
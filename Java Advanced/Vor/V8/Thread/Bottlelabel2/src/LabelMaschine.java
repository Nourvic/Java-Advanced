public class LabelMaschine implements Runnable {

    private Conveyor conveyor;


    public LabelMaschine(Conveyor conveyor) {
        this.conveyor = conveyor;
    }


    @Override
    public void run() {
        //  Bottle b = null;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (conveyor) {
                    while (conveyor.isEmpty()) {
                        System.out.println("Warten, da Foerderband leer.");
                        conveyor.wait();
                    }
                    Bottle b = new Bottle();
                    b = conveyor.withdraw();
                    Label label = new Label("Wasser", 2025);
                    b.setLabel(label);
                    System.out.print("Etikettiermaschine");
                    b.printLabel();
                    conveyor.notifyAll();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

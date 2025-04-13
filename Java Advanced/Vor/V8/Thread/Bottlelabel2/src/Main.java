public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();

        Thread t1 = new Thread(new BottlingPlant(conveyor));
        Thread t2 = new Thread(new LabelMaschine(conveyor));

        t1.start();
        t2.start();

    }
}
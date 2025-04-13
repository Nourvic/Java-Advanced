import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Conveyor con = new Conveyor();

        BottleMacshine bottleThread = new BottleMacshine(con, 500);
        LabelMascine LabelThread = new LabelMascine(con, 500);

        Thread ThreadBottle = new Thread(bottleThread);
        Thread ThreadLabel = new Thread(LabelThread);


        ThreadBottle.start();
        ThreadLabel.start();

    }
}
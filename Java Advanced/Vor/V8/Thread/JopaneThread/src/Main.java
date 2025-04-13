import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(new Worker(counter));
        thread.start();

        String test = JOptionPane.showInputDialog(null,"Interrupt!");

        thread.interrupt();
        System.out.println("Ende Main Threaad");
    }
}
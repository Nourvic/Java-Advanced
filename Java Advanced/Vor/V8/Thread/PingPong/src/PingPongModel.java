public class PingPongModel implements Runnable {

    private String text;
    private int delayl;

    public PingPongModel(String text, int delayl) {
        this.text = text;
        this.delayl = delayl;
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println(text);
                Thread.sleep(delayl);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.getMessage();
            }
        }
    }

}

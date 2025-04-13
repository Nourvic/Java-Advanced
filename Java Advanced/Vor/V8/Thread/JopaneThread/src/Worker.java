public class Worker implements Runnable {
    private Counter c;


    public Worker(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            c.printnextInt();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Interrupted");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Ende Threads");
    }
}

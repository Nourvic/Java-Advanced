

public class basis {

    public static void main(String[] args) {


        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1 :" + i);
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2 :" + i);
                }
            }
        };


        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);



        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getMessage();

        }
        System.out.println("Main Thread");
    }


}

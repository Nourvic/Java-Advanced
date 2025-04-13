public class Garten {

    public static void main(String[] args) {
        Counter c = new Counter();
        Thread east = new Thread(new Turnstile(c, 100));
        Thread west = new Thread(new Turnstile(c, 100));

        east.start();
        west.start();

        System.out.println("Ende Main");
    }
}

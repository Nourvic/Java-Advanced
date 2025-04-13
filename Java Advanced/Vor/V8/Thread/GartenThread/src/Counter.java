public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    //    Synchronized
    public    void inc() {
        count = count + 1;
        System.out.println(count);
    }
}

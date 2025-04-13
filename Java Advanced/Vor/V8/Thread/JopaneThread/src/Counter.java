public class Counter {
    private int count;

    public synchronized  void printnextInt(){
        count++;
        System.out.println(count);
    }
}

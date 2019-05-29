package may22.threads;


public class Main {

    public static void main(String[] args) {
        new Thread(new MinhaThreadRunnable("Thread #01", 100));
        new Thread(new MinhaThreadRunnable("Thread #02", 100));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

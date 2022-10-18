package BAI2;

public class TestThread {
    public static void main(String[] args) {
        EvenThread ev =new EvenThread();
        OddThread od =new OddThread();

        Thread thread =new Thread(ev);
        Thread thread1 =new Thread(od);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();





    }
}

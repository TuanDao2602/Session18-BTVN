package bai1;

public class Main {
    public static void main(String[] args) {
       NumberGenerator n1 =new NumberGenerator();
       NumberGenerator n2 = new NumberGenerator();
        Thread thread =new Thread(n1);
        Thread thread1 =new Thread(n2);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();
    }

}
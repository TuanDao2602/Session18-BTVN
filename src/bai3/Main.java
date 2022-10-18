package bai3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Phương thức 1");
        OptimizedPrimeFactorization op =new OptimizedPrimeFactorization();
        Thread thread = new Thread(op);
        thread.start();

        System.out.println("phương thức 2");
        LazyPrimeFactorization lr =new LazyPrimeFactorization();
        Thread thread1 =new Thread(lr);
        thread1.start();
    }
}

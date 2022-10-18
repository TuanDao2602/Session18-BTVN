package bai1;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        System.out.println("in ra 10 số nguyên đầu tiên");
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("số nguyên thứ "+i);
                    Thread.sleep(500);
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}

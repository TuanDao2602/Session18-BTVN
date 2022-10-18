package BAI2;

public class OddThread extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                if (i%2==1){
                    System.out.println("các số lẻ là :" + i);
                    Thread.sleep(10);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

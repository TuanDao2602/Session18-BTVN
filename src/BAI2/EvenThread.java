package BAI2;

public class EvenThread extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                if (i%2==0){
                    System.out.println("các số chẵn là "+i);
                    Thread.sleep(15);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

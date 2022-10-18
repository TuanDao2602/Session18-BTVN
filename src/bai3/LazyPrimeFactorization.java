package bai3;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên n");
        int n = Integer.parseInt(sc.nextLine());
        int dem =0;
        int i =2;
        while (dem<n){
            if (isPrimeNumber(i)){
                System.out.println("Phương Thức 1 " + i + " ");
                dem++;
            }
            i++;

        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = n;
        for (int i = 2; i < squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

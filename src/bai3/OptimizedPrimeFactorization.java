package bai3;

import java.util.Scanner;

public class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên n");
        int n = Integer.parseInt(sc.nextLine());
        int dem =0;
        int i =2;
        while (dem<n){
            if (isPrimeNumber(i)){
                System.out.println("Phương thức 2 " + i + " ");
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
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


//    public static boolean kiemTraSoNguyenTo(int n){
//        if (n<2){
//            return false;
//        }else {
//            for (int i = 2; i < Math.sqrt(n); i++) {
//                if (n%i==0){
//                    return false;
//                }
//
//            }
//
//        }
//    } return true;
//}

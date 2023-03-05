package baitap_day2;

import java.util.Random;
import java.util.Scanner;

public class bai_122 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        Random random = new Random();
        System.out.println("nhap kich thuoc mang");
        n = in.nextInt();
        if(n < 1){
            System.out.println("khong hop le");
            System.exit(0);
        }
        double[] arr = new double[n] ;
        for( int i = 0; i < n; i ++ ){
            arr[i] = random.nextDouble(100);
        }
        for( int i = 0; i < n; i ++ ){
            System.out.println(arr[i]);
        }

        double  max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("so lon nhat la:" + max);
    }
}

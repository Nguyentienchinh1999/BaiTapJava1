package baitap_day2;

import java.util.Random;
import java.util.Scanner;

public class bai_123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n;
        System.out.println("nhap kich thuoc mang");
        n = in.nextInt();
        if(n < 1){
            System.out.println("khong hop le");
            System.exit(0);
        }
        int[] arr = new int[n] ;
        for( int i = 0; i < n; i ++ ){
            arr[i] = random.nextInt(100);
        }
        for( int i = 0; i < n; i ++ ){
            System.out.println(arr[i]);
        }
        int  min = arr[0],  temp = arr[0], index = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                index= i;
            }
        }
        System.out.println("vi tri cua so be nhat la:" + index);
        System.out.println("so be nhat la:" + min);
    }
}

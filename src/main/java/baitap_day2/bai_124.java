package baitap_day2;

import java.util.Random;
import java.util.Scanner;

public class bai_124 {
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
            arr[i] = random.nextInt(3000);
        }
        for( int i = 0; i < n; i ++ ){
            System.out.println(arr[i]);
        }

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0 & arr[i] < 2004)
                System.out.println("cac so thỏa mãn đk là: ");
            System.out.println(arr[i]);
            }
        }

    }


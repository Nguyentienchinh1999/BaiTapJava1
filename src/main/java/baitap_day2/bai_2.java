package baitap_day2;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        int n, S = 1, total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");
        n = in.nextInt();
        if(n <= 0){
            System.out.println("khong hop le");
            System.exit(0);
        }
        for(int i = 1; i <= n; i++){
            S = (i*i)  ;
            total += S;
        }
        System.out.println("S:" + total);
    }
}

package baitap_day2;

import java.util.Scanner;

public class bai_33 {
    public static void main(String[] args) {
        int n;  float S = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");
        n = in.nextInt();
        for(int i = 0; i < n; i++){
          S += Math.sqrt(S + 2);
        }
        System.out.println(S);
    }
}

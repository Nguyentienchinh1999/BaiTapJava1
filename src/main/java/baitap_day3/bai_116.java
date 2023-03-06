package baitap_day3;

import java.util.Scanner;

public class bai_116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");
        int n = in.nextInt();
        if(Sum(n) != -1){
            System.out.println(Sum(n));
        }else {
            System.out.println("khong hop le");
        }

    }

    public static int Sum(int n) {
        if (n < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}

package baitap_day3;

import java.util.Scanner;

public class bai_117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");
        int n = in.nextInt();
        System.out.println("nhao vao x:");
        double x = in.nextDouble();
        System.out.println(Sum(n,x));
    }
    public static double Sum( int n , double x ){
            double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(x,i);
        }
        return sum;
    }
}

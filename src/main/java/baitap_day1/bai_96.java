package baitap_day1;

import java.util.Scanner;

public class bai_96 {
    public static void main(String[] args) {
        double x;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao X:");
        x = in.nextDouble();
        if(x >=5){
            result = 2*x*x + 5*x + 9;
            System.out.println(result);
        }else{
            result = -2*x*x + 4*x - 9;
            System.out.println(result);
        }
    }
}

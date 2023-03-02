package baitap_day1;

import java.util.Scanner;

public class bai_82 {
    public static void main(String[] args) {
//        82
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vào 3 số a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if(b > a && c > b){
            System.out.println("max la" + c);
        }else if(b > a && c < b){
            System.out.println("max la" + b);
        }else System.out.println("max la" + a);
    }
}

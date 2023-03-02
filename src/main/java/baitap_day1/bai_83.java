package baitap_day1;

import java.util.Scanner;

public class bai_83 {
    public static void main(String[] args) {
        // 83
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao 2 so x, y");
        x = in.nextDouble();
        y = in.nextDouble();

        if(x == 0 || y == 0){
            System.out.println("Không hợp le");
            System.exit(0);
        }
        if(x * y < 0){
            System.out.println("khác dấu");
        }else {
            System.out.println("cung dau");
        }
    }
}

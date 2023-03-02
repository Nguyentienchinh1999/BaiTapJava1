package baitap_day1;

import java.util.Scanner;

public class bai_97 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner in =new Scanner(System.in);
        System.out.println("nhap vao 3 canh;");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if(a == b && a == c){
            System.out.println("tam giac deu");
        }
        else if(a == b || c == b || a == c){
            System.out.println("tam giac can");
        }
        else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
            System.out.println("tam giac vuong");
        }
        else{
            System.out.println("tam giac thuong");
        }
    }
}

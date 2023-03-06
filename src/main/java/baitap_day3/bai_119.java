package baitap_day3;

import java.util.Scanner;

public class bai_119 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");

        int n = in.nextInt();
        timSoNguyenTo(n);
    }
    public static boolean kiemTraNguyenTo(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void timSoNguyenTo(int n){
        for(int i = 0; i < n; i++){
            if(kiemTraNguyenTo(i)){
                System.out.println(i);
            }
        }
    }
}

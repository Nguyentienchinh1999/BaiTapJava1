package baitap_day2;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        int n; float S = 1; float total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao n:");
        n = in.nextInt();
        if(n <= 0){
            System.out.println("khong hop le");
            System.exit(0);
        }
        for(int i = 1; i <= n; i++){
            S = (float) 1/(i);
           total += S;
        }
        System.out.println("S:" + total);
    }
}

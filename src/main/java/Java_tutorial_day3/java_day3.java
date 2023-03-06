package Java_tutorial_day3;

import java.util.Scanner;

public class java_day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b;
        System.out.println("nhap a va b:");
        a = in.nextFloat();
        b = in.nextFloat();
        System.out.println(Sum(a, b));
    }
    public static float Sum(float a, float b) {
        return a + b;
    }
}

package baitap_day2;

import java.util.Scanner;

public class bai_134   {
    public static void main(String[] args) {
        int arr[] = {100, 300, 250, 1000, 765, 987};
        int max = arr[0];
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("so lon nhat la:" +  max);

    }
}

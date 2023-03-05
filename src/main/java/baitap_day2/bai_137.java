package baitap_day2;

public class bai_137 {
    public static void main(String[] args) {
        double arr[] = {2200, 2555, 367, 600, 997};
        double min = arr[0];
        int index = 0;
        for(int i =0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
            }
        System.out.println("vi tri index Nhỏ nhất là:"  + index);

        }
    }


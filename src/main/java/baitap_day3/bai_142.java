package baitap_day3;

public class bai_142 {
    public static void main(String[] args) {
        double arr[] = {259, 18.0, 12.55, 255.25, 100.0, 98.2};
        System.out.println(minArr(arr));
    }

    public static double minArr(double[] arr) {
        double min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}


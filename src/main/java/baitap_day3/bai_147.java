package baitap_day3;

public class bai_147 {
    public static void main(String[] args) {
        double arr[] = {259, 18.0, -12.55, 255.25, 100.0, -98.2};
        System.out.println(timSoAm(arr));
    }
    public static double timSoAm(double arr[]){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > 0){
                return arr[i];
            }
        }
        return - 1;
    }
}

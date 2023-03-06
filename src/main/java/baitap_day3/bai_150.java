package baitap_day3;

public class bai_150 {
    public static void main(String[] args) {
        double arr[] = {259, 18.0, -12.55, 255.25, -100.0, 98.2};
        System.out.println(timSoAmLonNhat(arr));
    }
    public static double timSoAmLonNhat(double arr[]){
        double min = arr[0];
        for(int i =0; i < arr.length; i++){
            if(arr[i] < 0){
              min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0 && arr[i] > min){
                min =arr[i];
            }
        }
        return min;
    }
}

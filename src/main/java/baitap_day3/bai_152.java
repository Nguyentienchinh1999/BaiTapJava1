package baitap_day3;

public class bai_152 {
    public static void main(String[] args) {
        int arr[] = {3,0, 8, 28, 496};
        System.out.println(timSoHoanHao(arr));
    }
    public static int timSoHoanHao(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(kiemTraSoHoanHao(arr[i])){
               min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min && kiemTraSoHoanHao(arr[i])){
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean  kiemTraSoHoanHao(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0) {
                sum += i;
            }
            if(sum == n){
                return true;
            }
        }
        return false;
    }
}

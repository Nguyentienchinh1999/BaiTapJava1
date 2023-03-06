package baitap_day3;

public class bai_151 {
    public static void main(String[] args) {
        int arr[] = {-2, 3, 20, 7, 99, 100, 5};
        System.out.println( timSoNguyenToLonNhat(arr));
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

    public static int timSoNguyenToLonNhat(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(kiemTraNguyenTo(arr[i])){
                max = arr[i];
            }
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max && kiemTraNguyenTo(arr[i])){
                max = arr[i];
            }
        }
        return max;
    }
}

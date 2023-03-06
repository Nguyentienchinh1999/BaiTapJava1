package baitap_day3;

public class bai_144 {
    public static void main(String[] args) {
        int arr[] = {-2, 3, 20, 7, 99, 100, 5};
        System.out.println( timSoNguyenTo(arr));
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

    public static int timSoNguyenTo(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(kiemTraNguyenTo(arr[i])){
               return arr[i];
            }
        }
        return -1;
    }
}

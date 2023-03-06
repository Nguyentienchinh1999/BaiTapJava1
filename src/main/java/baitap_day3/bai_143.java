package baitap_day3;

public class bai_143 {
    public static void main(String[] args) {
        int  arr[] = {1,3,4,5,7,8,90};
        System.out.println(timSoChan(arr));
    }
    public static int timSoChan(int arr[]){
        for(int i =0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                return arr[i];
            }
        }
        return - 1;
    }
}

package baitap_day2;

public class bai_136 {
    public static void main(String[] args) {
        int arr[] = {100, 255, 367, 600, 997};
        int index = 0;
        for(int i = arr.length - 1; i >= 0; i-- ){
            if(arr[i] % 2 == 0){
                System.out.println("so chan cuoi cung la:"  +arr[i]);
                break;
            }else index = -1;
            System.out.println("index = " + index);
            break;
        }
    }
}

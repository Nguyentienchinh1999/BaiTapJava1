package baitap_day2;

public class bai_141 {
    public static void main(String[] args) {
        double arr[] = {2200, -2555, -367, 600, -997};
        double min = -1;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                if(count == 0){
                    min = arr[i];
                    count ++;
                }else if(min > arr[i]){
                    min = arr[i];
                }
            }
        }
        int index = -1;
        if(min != -1){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == min){
                    index = i;
                }
            }
        }
        System.out.println(index);
    }
}

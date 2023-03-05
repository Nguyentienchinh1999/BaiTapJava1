package baitap_day2;

public class bai_135 {
    public static void main(String[] args) {
        double arr[] = {-100, -300, 250, -1000, -765, 987};
        int index = 0;
        for(int i =0; i <arr.length; i++){
            if(arr[i]  >  0){
                System.out.println("so duong dau tien la:" + arr[i]);
                break;
            }else index = -1;
            System.out.println("index = " + index);
            break;
        }
    }
}

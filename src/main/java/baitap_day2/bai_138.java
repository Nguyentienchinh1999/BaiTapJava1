package baitap_day2;

public class bai_138 {
    public static void main(String[] args) {
        int arr[] = {223, 255, 367, 6003, 997};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                System.out.println("vi tri index chăn đâ tiên là:" + index);
                break;

            }else index = -1;
            System.out.println("index = " + index);
            break;
        }

    }
}

package baitap_day3;

public class bai_153 {
    public static void main(String[] args) {
        int arr[] = {1, 20, 32, 4, 50, 8, 9};
        System.out.println(minChan(arr));
    }

    public static int minChan(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min && arr[i] % 2 == 0) {
                min = arr[i];
            }
        }
        return min;
    }
}

package Java_tutorial_day4_baitap_Inheritance.HinhChuNhat;

public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.setChieuDai(10);
        hv.setChieuRong(8);
        System.out.println(hv.toString());

        HinhChuNhat hcn = new HinhChuNhat(4,5);
        System.out.println(hcn.toString());
    }
}

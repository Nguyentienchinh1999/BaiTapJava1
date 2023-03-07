package Java_day4_baitap_Encapsulation.HinhChuNhat;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn =  new HinhChuNhat(0,4);
        System.out.println("chu vi la: " + hcn.chuVi());
        System.out.println("dien tich la: " + hcn.dienTich());
        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.setChieuDai(1.5);
        hcn2.setChieuRong(3);
        System.out.println("chu vi la: " +hcn2.chuVi());
        System.out.println("dien tich la: " +hcn2.dienTich());
    }
}

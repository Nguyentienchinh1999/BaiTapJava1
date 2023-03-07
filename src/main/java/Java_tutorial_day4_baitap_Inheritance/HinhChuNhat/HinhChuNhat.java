package Java_tutorial_day4_baitap_Inheritance.HinhChuNhat;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai <=0 && chieuRong <=0){
            throw new RuntimeException("không phải là số lượng");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai <=0){
            throw new RuntimeException("không phải là số lượng");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <=0){
            throw new RuntimeException("không phải là số lượng");
        }
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi(){
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }
    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuvi=" + tinhChuVi() +
                ", dientich=" + tinhDienTich() +
                '}';
    }
}

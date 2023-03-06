package Java_tutorial_day3;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double chuVi(){
       return (chieuRong + chieuDai) * 2;
    }
    public double dienTich(){
        return chieuRong * chieuDai;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}

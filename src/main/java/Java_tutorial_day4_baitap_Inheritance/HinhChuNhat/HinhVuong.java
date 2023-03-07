package Java_tutorial_day4_baitap_Inheritance.HinhChuNhat;

public class HinhVuong extends HinhChuNhat{
    private double canh = 1;
    public HinhVuong() {

    }

    public HinhVuong(double canh){
        super(canh,canh);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("không phải là số lượng");
        }
        this.canh = canh;
        super.setChieuRong(canh);
        super.setChieuRong(canh);

    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                ",chuvi=" + tinhChuVi() +
                ", dientinh=" + tinhDienTich() +
                "}";
    }
}

package Java_tutorial_day4.donggoi1;

public class HinhTron {
    private double banKinh;

    public double chuVi(){
        return banKinh * 2 * Math.PI;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh > 0){
            this.banKinh = banKinh;
        }
        else {
            System.out.println("khong hop le");
        }
    }

    public HinhTron() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
}

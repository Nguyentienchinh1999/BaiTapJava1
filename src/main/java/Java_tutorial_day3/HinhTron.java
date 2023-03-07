package Java_tutorial_day3;

public class HinhTron {
    double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    public double chuVi(){
       return banKinh * 2 * 3.14;
    }


    public double dienTich(){
        return banKinh * banKinh * 3.14;
    }
    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }

}

package Java_day4_baitap.Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        if(r > 0){
            this.radius  = r;
        }
        else {
            System.out.println("khong hop le");
        }
        this.color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}

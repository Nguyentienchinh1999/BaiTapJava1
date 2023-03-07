package Java_day4_baitap.Rectangle;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (width + length) * 2;
        }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + " width=" + width + "]";
    }
}

package exercise1;

public class Rectangle extends shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        return length*width;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
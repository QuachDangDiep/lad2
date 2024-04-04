package exercise1;

public class Rectangle extends shape {
    private double length;
    private double width;
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
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

package exercise1;

public class triangle extends shape{
    private double base;
    private double height;

    public triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return (base*height)/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package lab6_part3;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) throws InvalidTriangleException{


        if(a <= 0 || b <= 0 || c <= 0) {
            throw  new  InvalidTriangleException("Side must be greater than 0");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

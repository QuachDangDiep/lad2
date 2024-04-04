package Exercise2;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle rectangleA;
        Rectangle rectangleB;

        rectangleA=new Rectangle();
        rectangleB=new Rectangle(7, 8);

        rectangleB.display();

        System.out.println("-----------------------------------");
        rectangleB.setHeight(10);
        rectangleB.setWidth(18);
        rectangleB.display();
        System.out.println("-----------------------------------");
        System.out.println("Area: "+rectangleB.getArea());
        System.out.println("Perimeter: "+ rectangleB.getPerimeter());
    }
}

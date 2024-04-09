package exercise1;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7,8);
        triangle triangle = new triangle(5,10);

        System.out.println("Dien tich hinh chu nhat: "+rectangle.getArea());
        System.out.println("Dien tich hinh tam giac: "+triangle.getArea());
    }
}
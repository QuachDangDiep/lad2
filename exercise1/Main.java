package exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(8,10);
        triangle triangle=new triangle(5,9);

        System.out.println("Dien tich hinh chu nhat: "+rectangle.getArea());
        System.out.println("Dien tich hinh tam giac: "+triangle.getArea());
    }
}

package session2;

public class Cat extends Animal {
   private String color;
   private int age;
   private int height;

    public Cat(String name, String color, int age, int height) {
        // Gọi tới constructor của lớp cha
        // Để gán giá trị cho các Field của lớp cha
        super(name);
        this.color = color;
        this.age = age;
        this.height= height;
    }
    public void jump(){
        System.out.println("Cat Jump!!!");
    }
// Tinh chat Da hinh trong oop
    @Override
    public void talk() {
        System.out.println("Cat talk!!!");
    }
}

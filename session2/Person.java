package session2;

public class Person extends Animal{
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        super(name);
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void talk() {
        System.out.println("Person Talk!!!");
    }
}

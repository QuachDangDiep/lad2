package session2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // phuong thuc abstract -> the hien tinh triu tuong
    // cho phep duov dinh nghia lai o lop con
    public abstract void talk();

}

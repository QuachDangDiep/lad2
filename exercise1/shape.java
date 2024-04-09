package exercise1;

public abstract class shape {
    private String color;
    public shape(String color) {
        this.color = color;
    }
    public shape(){

    }
    abstract double getArea();

    @Override
    public String toString() {
        return super.toString();
    }
}
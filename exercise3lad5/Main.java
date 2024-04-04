package exercise3lad5;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(0,0,8,8);
        MovableCircle movableCircle =new MovableCircle(6,movablePoint);
        System.out.println(movableCircle.toString());
    }
}

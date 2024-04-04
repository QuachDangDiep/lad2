package exercice2;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(0,0);
        movablePoint.moveUp();
        System.out.println("y: "+movablePoint.gety());
    }
}

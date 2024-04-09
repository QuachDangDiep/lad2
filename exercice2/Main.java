package exercice2;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(9,8);
        movablePoint.moveUp();
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movablePoint.moveRight();
        System.out.println("y: "+movablePoint.getY());
        System.out.println("x: "+movablePoint.getX());
    }
}

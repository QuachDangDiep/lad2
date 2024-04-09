package exercise3lad5;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(0,0,5,5);
        System.out.println("Initial point position: "+String.valueOf(movablePoint));
        movablePoint.moveRight();
        movablePoint.moveDown();
        MovablePoint movablePoint1=new MovablePoint(5,5,5,5);
        System.out.println("Point position after moving down and right: "+String.valueOf(movablePoint1));
        MovablePoint movablePoint2=new MovablePoint(10, 10,2,2);
        System.out.println("Initial circle position: MovableCircle{center= "+String.valueOf(movablePoint2));
//        MovableCircle movableCircle=new MovableCircle(5,);
    }
}

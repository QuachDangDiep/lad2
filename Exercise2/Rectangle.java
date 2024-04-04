package Exercise2;

import java.sql.SQLOutput;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        // To do
        this.height=7;
        this.width=8;
    }
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public void display(){
         for (int i=0; i < height; i++){
             for (int j = 0; j < width; j++){
                 System.out.printf("#");
             }
             System.out.println();
         }
    }
    public int getArea() {
        return this.height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getPerimeter(){
        return 2* (height + width);
    }

    public void printInfo() {

    }
}

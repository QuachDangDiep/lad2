package session5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        // Nếu nhập dữ liệu nho hơn hoặc bằng 0 thì nhập lại
        while (size <= 0){
            boolean check = false;
            while (!check){// Vòng lặp while để lặp khi nhày vào khối catch
                try{
                    System.out.println("Nhap vao khoi luong cua phan tu mang");
                    size = Integer.parseInt(sc.nextLine());
                    check = true;
                }catch (ArithmeticException sql){
                    System.out.println("Arithmetic");
                }
                catch (OutOfMemoryError io){
                    System.out.println("Ofmen");
                }
                catch (InputMismatchException input) {
                    System.out.println("Input data wrong!!!");
                }
                catch (NumberFormatException e ){
                    System.out.println(" Nhap sai, vui long nhap lai");
                }
            }
        }
    }
}

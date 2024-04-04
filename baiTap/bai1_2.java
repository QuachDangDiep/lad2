package baiTap;

import java.util.Scanner;

public class bai1_2 {
    public static void main(String[] args) {
        /*
        Bài tập Java:
            Viết chương trình nhập số a từ bàn phím,
        Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a
        Nếu a lẻ thì in ra dòng chữ "tôi o tính tổng số lẻ, bye bye" và thoát chương trình
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên a: ");
        int a;
        int tong = 0;
        a = sc.nextInt();
        if (a%2 !=0){
            System.out.println("tôi o tính tổng số lẻ, bye bye ");
        }
        else {
            for (int i=0;i<=a;i+=2){
                tong+=i;// tong = tong+i
            }
            System.out.println("Tổng các số chẵn từ 0 đến "+a + "= "+tong);
        }
    }
}

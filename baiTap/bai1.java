package baiTap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào số nguyên n, in ra kết quả n!
        Dùng vòng lặp for
        Dùng vòng lặp while

        // for
        // Ví dụ : 3! = 1*2*3
        // For
        */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n:");
        int n = sc.nextInt();

        int gt = 1;
        for (int i=1; i<=n; i++){
            System.out.println(i);
            gt=gt*i;
            System.out.println(gt);
        }*/

        //while
        int n;
        int i = 1;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n:");
        n = sc.nextInt();
        // tinh giai thua
        while (i<=n){
            gt*=i;
            i++;
        }
        System.out.println(n+ "! = "+gt);
    }
}

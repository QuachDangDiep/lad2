package baiTap;

import java.util.Scanner;

public class bai1_4 {
    public static void main(String[] args) {
        /*
        Bài tập Java:
        Viết chương trình :
        Tìm những số chia hết cho 3 từ 10 đến 50
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n:");
        int n = sc.nextInt();
        for (int i=10;i<=n;i++){
            if (i%3 ==0)
                System.out.print(i+" ");
        }
    }
}

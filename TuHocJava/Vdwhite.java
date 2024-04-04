package TuHocJava;

import java.util.Scanner;

public class Vdwhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời cụ nhập một số bất kỳ từ 1 đến 99: ");
        int n = sc.nextInt();
        while (n<1 || n>99)
        {
            System.out.println("Nhập lại n, n chỉ được phép từ 1-99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n= "+n);
    }
}

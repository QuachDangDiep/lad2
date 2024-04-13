package session6;

import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        System.out.println("Ban muon luu bao nhieu phan tu mang:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int intArray[] = new int[size];//Mang "tam"
        //Truyển mảng tạm cho hàm createArray(int[] arr)
        arrayExample.createArray(intArray);
        System.out.println("Mảng vừa nhập là: ");
        arrayExample.showArray(intArray);

        System.out.println("Mảng sau khi sắp sếp: ");
        arrayExample.ascSort(intArray);
        arrayExample.showArray(intArray);
//        String names[] = new String[10];
//        boolean gender[];
    }
}

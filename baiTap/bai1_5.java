package baiTap;

public class bai1_5 {
    public static void main(String[] args) {
        /*
        Bài tập Java:
        Viết chương trình :
        Tình tổng S= 1!+2!+3!...+10!
        */
        int n=1;
        int tong = 1;
        for (int i=1;i<=10;i++){
            n*=i;
            tong+=n;
        }
        System.out.println("Tổng cần tính = " +tong);
    }
}

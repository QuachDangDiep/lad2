package session5;

public class TryCatchDemo {
    public static void tryCatchDemo(){
        int a =20;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);

        }catch (Exception e){
            System.out.println("Khong the chi cho 0. "+e.getMessage());
        }finally {
            System.out.println("Khoi lenh lay luon duoc thuc thi");
        }
    }
    public static void tryCatchFinallyDemo(){}
    /* try-catch lồng nhau, khi khối try-catch lồng trong 1 khối try-catch khác
    * sử dụng khi tình huống có thể pháp sinh trong đó có một phần của khối có thể gây ra lỗi
    *
    *
    * */
    public static void nestedTryCatchDemo(){
        try {
            try {
                System.out.println("thức hiện phép chia: ");
                int b =1000/0;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            try{
                int a [] = new int[10];
                a[10] = 20;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

        }catch (Exception e){
            System.out.println("Kiểm soát được lỗi");
        }
        System.out.println("Luồng chạy bình thường");
    }
}

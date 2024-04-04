package TuHocJava;

public class breakContinue {
    public static void main(String[] args) {
        int Tong = 0;
        for (int i=0;i<=5;i++){
            if (i==3)
                continue;
            else
                Tong+=i;
        }
        System.out.println("tống ="+Tong);
        //break
        int n = 0;
        while (n<100){
            System.out.println("n = "+n);
            if (n == 15)
                break;
            n++;
        }
    }
}

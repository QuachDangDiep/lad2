package Java_lad6;
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class UncheckedException {
    /**
     * Constructor for objects of class Client
     */
    public UncheckedException(){
        //To do:
    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];

        // Decalre Scanner Object named input
        java.util.Scanner input = new java.util.Scanner(System.in);

        for (i=0; i<=n; i++){
            System.out.printf("a[%d] = ",i);
            a[i] = input.nextInt();
        }
    }
}

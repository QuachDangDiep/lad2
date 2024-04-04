package lad05;

public class Main {
    public static void main(String[] args) {
        taxmanager taxmanager = new taxmanager();

        company company1 = new company();
        company company2 = new company();
        freeland freeland1 = new freeland();
        employee employee1 = new employee();

        taxmanager.addtaxpayer(company1);
        taxmanager.addtaxpayer(company2);
        taxmanager.addtaxpayer(freeland1);
        taxmanager.addtaxpayer(employee1);


        System.out.println("thong tin ve doi tuong: " +taxmanager);
        System.out.println("So luong nguoi dong thue: "+taxmanager.getCount());
        System.out.println("tong tien thue: "+taxmanager.gettax());
    }
}

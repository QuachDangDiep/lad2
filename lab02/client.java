package lab02;
/*
Lớp Client sử dụng lớp Student để xây dựng chương trình java theo kịch bản.
 *
 * @author (your name)
 * @version (a version number or a date)

*/
public class client {
    public static void main(String[] args) {
        student studentA;
        student studentB;

        studentA=new student();
        studentB=new student(1,"Quach Dang Diep", true);

        studentB.printInfo();

        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}

package session4;

import java.util.ArrayList;

public class ApplicationDemo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("TigerVN");
        CanEat tiger1 = new Tiger("TigerCN");
        Animal tiger2 = new Tiger("TigerTW");
        boolean istiger = tiger1 instanceof Tiger;
        System.out.println("tiger is tiger "+ istiger);
        // Casting: ép kiểu về đúng kiểu class của nó
        if (tiger1 instanceof  Tiger){
            Tiger tg = (Tiger) tiger2;
            tg.drink();
        }

//        List<String> student;
//        ArrayList<String> student2;
    }
}

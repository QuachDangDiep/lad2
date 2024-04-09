package Java_lad6;

public class MoreClass {
    public static void main(String[] args) {
        Object object1 = new Object();
        System.out.println(object1);

        Object object2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(object2);
    }
}

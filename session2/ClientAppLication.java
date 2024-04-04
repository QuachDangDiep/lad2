package session2;

public class ClientAppLication {
    public static void main(String[] args) {
        //OOP
        Student sv = new Student("Diep",2005,"Bac Ninh");
        System.out.println("Student information");
        System.out.println("Name: "+sv.getName());
        System.out.println("Age: "+sv.getBornYear());
        System.out.println("Place: "+sv.getPlaceOfBirth());


        Cat muop = new Cat("Meo Muop", "Tam the", 3, 123);
        Animal tom = new Cat("Tom", "vang", 5,120);

        boolean isAnimal = tom instanceof Animal;
        System.out.println("Ten cua muop"+muop.getName());
        System.out.println("Ten cua tom"+tom.getName());
        System.out.println("tom is instanceof Animal" +isAnimal);
    }
}

package day54;

public class AnimalShow {
    public static void main(String[] args) {

        Dog d1=new Dog();
        Animal a1=d1;
        a1.speak();
        Object o1=d1;
        o1.toString();

        IndoorPet p1=d1;
        p1.play();




    }
}

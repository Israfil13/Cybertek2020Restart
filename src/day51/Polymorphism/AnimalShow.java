package day51.Polymorphism;

public class AnimalShow {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Dog d1=new Dog();
        d1.makeNoise();
        a1=d1;
         a1=new Horse();
         a1.makeNoise();



    }



}

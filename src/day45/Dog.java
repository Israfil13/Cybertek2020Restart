package day45;

public class Dog extends Animal {
//
//    public void speak(){
//        System.out.println("Bark");
//    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.speak();
    }



}

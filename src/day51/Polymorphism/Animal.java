package day51.Polymorphism;

public class Animal {
    public void makeNoise(){
        System.out.println("gerneral aniaml choise");
    }

}


class Dog extends Animal{
    public void makeNoise()
    {
        System.out.println("Hav-hav");
    }

}

class  Horse extends Animal{
    public void makeNoise()
    {
        System.out.println("kisne");
    }
}
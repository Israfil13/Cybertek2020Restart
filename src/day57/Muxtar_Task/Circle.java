package day57.Muxtar_Task;

public class Circle {
    int radius;
        @Override
    public boolean equals(Object circle){
        Circle othercirlce=(Circle) circle;
        return this.radius==othercirlce.radius;
    }

}

class Test{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=5;
        Circle c2=new Circle();
        c2.radius=3;
        System.out.println("c1.equals(c2) = " + c1.equals(c2));


    }
}
package day47;

public class Geometry {
    public static void main(String[] args) {
        Triangle t1=new Triangle(5,6);
        t1.calculateArea();
        System.out.println(t1);

        Rectangle r1=new Rectangle("dorbucaqli",5,5);

        System.out.println("r1 = " + r1);

    }
}

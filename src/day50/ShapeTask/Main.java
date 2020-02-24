package day50.ShapeTask;

public class Main {
    public static void main(String[] args) {
        Square s1=new Square("kvadrat",10);
        System.out.println("s1 = " + s1);
        s1.calculatearea();
        System.out.println("s1 = " + s1);
        s1.draw();
    }
}

package day52.Polymorphism;

public class ShapeTest {
    public static void main(String[] args) {

//        Circle c1=new Circle("penny",5);
       Shape c1=new Circle("penny",5);
//        Object c1=new Circle("penny",5);
//        Drawable c1=new Circle("penny",5);
        Shape c2=new Rectangle("duzbucaq",4,3 );

        System.out.println(c1.getClass().getSimpleName());

        printAnyShapeArea(c1);
        printAnyShapeArea(c2);
        printAnyShapeArea(new Square("kvadrat",5));

    }

public static void printAnyShapeArea(Shape anyShape){
    anyShape.calculatearea();
    System.out.println(anyShape.name+" 's area is = "+anyShape.area);


}



}

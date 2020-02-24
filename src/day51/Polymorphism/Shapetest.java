package day51.Polymorphism;

import codenote_Practice.Arraylist_Practice_Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shapetest {
    public static void main(String[] args) {
        Shape s1= new Triangle();
        Shape s2= new Rectangle();
        Shape s3= new Circle();
        Shape s4= new Oval();
        Shape s5= new Square();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        Shape[] geometry ={s1,s2,s3,s4,s5};
        for (Shape each:geometry){
            each.draw();
        }

        List<Shape> shapes= new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        for (int i = 0; i <shapes.size(); i++) {
            shapes.get(i).draw();
        }

    }
}

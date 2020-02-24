package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetAction {
    public static void main(String[] args) {

        Pet p1=new Pet("Horse","Boz At");
        System.out.println("p1 = " + p1);
        p1.speak();

        Pet p2=new Pet();
        System.out.println("p2 = " + p2);
        p2.setType("dog");
        p2.setName("Toplan");
        System.out.println("p2 = " + p2);
        p2.speak();
        Pet p3 = new Pet("cat", "Samantha");
        Pet p4 = new Pet("dog", "Oliver");
        Pet p5 = new Pet("dog", "Henry");
        Pet p6 = new Pet("cow", "Adam");
        Pet p7 = new Pet("ant", "Atom");
        Pet p8 = new Pet("bear", "Teddy");
        Pet p9 = new Pet("cat", "Stephanie");

        List<Pet> mypet=Arrays.asList(p1,p2);
        System.out.println(mypet);

        for (Pet each:mypet){
            System.out.println("each.getName() = " + each.getName());
        }


        
    }
}

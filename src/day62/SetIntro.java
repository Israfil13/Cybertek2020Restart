package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {
        Set<Integer> mynums=new HashSet<>();
        mynums.add(10);
        mynums.add(10);
        mynums.add(22);
        mynums.add(13);
        mynums.add(30);
        mynums.add(30);
        System.out.println("mynums = " + mynums);

        Set<Integer> my=new HashSet<>(Arrays.asList(1,1,2,5,9,9,5));
        System.out.println("my = " + my);


        Set<String> states=new HashSet<>(Arrays.asList("TX","FL","FL","NY","TX","CL"));

        Iterator<String> itestates=states.iterator();

        while (itestates.hasNext()){
            String st=itestates.next();
            System.out.print(st+" ");
        }

        System.out.println();
        states.forEach(each-> System.out.print(each+" "));

        System.out.println();
        for (String each:states){
            System.out.print(each+" ");
        }





    }
}

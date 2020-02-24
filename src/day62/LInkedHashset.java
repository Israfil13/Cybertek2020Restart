package day62;

import java.util.LinkedHashSet;
import java.util.Set;

public class LInkedHashset {
// primary difference between HashSet and LinkedHashSet is LinkedHashSet keep insertion order

    public static void main(String[] args) {
        Set<Integer> mynums= new LinkedHashSet<>();
        mynums.add(10);
        mynums.add(10);
        mynums.add(22);
        mynums.add(13);
        mynums.add(30);
        mynums.add(30);

        System.out.println("mynums = " + mynums);

    }
}

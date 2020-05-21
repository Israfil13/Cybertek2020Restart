package Practice_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionPractice {
    public static void main(String[] args) {
        Collection<Integer> coll= new ArrayList<>();

        coll.add(3);
        coll.addAll(Arrays.asList(4,5,6,7,55,12));
        System.out.println(coll);

        coll.retainAll(Arrays.asList(4,5,9,12));
        System.out.println(coll);

        coll.removeIf(each->each<5);
        System.out.println(coll);

        Integer[] inArray=coll.toArray(new Integer[0]);
        System.out.println(Arrays.toString(inArray));


    }

}

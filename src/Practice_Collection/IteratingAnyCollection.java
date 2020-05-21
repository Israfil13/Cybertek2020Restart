package Practice_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {
        Collection<Integer> coll=new ArrayList<>(Arrays.asList(12,44,15,63,78,122,66));

        for (Integer each :coll){
            System.out.println(each);
        }

     Iterator<Integer> myIter= coll.iterator();

        System.out.println(myIter.hasNext());
        System.out.println(myIter.next());
        System.out.println(myIter.next());
        System.out.println(myIter.next());

        myIter.remove();

        while (myIter.hasNext()){
            Integer each=myIter.next();
            System.out.print(each+" - ");

            if (each>70){
                myIter.remove();
            }
        }






        System.out.println();
        System.out.println(coll);









    }
}

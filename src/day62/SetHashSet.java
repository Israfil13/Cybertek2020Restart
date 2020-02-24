package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// REMEMBER : In HashSet THERE IS NO DEFINED ORDER !!!!!!!!!!!!!!!!!!!!!!
//  YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE
// You can use all the methods coming from Collection interface


public class SetHashSet {
    public static void main(String[] args) {
        Set<String> states=new HashSet<>(Arrays.asList("TX","FL","FL","NY","TX","CL"));

//        Iterator<String> statite=states.iterator();
//        while(statite.hasNext()){
//           String each=statite.next();
//           if (each.contains("L")){
//               statite.remove();
//           }
//        }

        states.removeIf(each->each.contains("L"));

        System.out.println(states);
    }
}

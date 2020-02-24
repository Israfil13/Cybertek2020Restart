package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num206_ArrayList_repeatAll {
    public static void main(String[] args) {
ArrayList<Boolean> bools= new ArrayList<>(Arrays.asList(true, false, false));
repeatAL(bools);



}
public static void repeatAL (ArrayList<Boolean> bools){

        bools.addAll(bools);

    System.out.println(bools);
}

}

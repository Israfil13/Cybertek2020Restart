package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num193_Arraylist_combinearrays {
    public static void main(String[] args) {

    }
    public static String combineRs(String[] r1,String[] r2)
    {
        List<String> list1=new ArrayList<>(Arrays.asList(r1));

            list1.addAll(Arrays.asList(r2));
       String combined="";
        for (int i = 0; i <list1.size() ; i++) {
            combined+=list1.get(i);
        }
            return combined;

    }
}

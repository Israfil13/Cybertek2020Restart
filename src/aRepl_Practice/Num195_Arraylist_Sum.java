package aRepl_Practice;

import java.util.ArrayList;

public class Num195_Arraylist_Sum {
    public static void main(String[] args) {

    }
    public static int sum(ArrayList<Integer> ints)
    {
        int sum=0;
        for (int i = 0; i < ints.size(); i++) {
            sum+=ints.get(i);
        }
return sum;
    }
}

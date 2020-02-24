package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num213 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));

    }
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)
    {
            if (r.contains(n)){
                r.removeAll(Arrays.asList(n));
            }

        return r;





    }




}

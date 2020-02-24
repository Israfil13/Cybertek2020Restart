package aRepl_Practice;

import java.util.ArrayList;

public class Num201_appendPosSUm {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> nums){
        ArrayList<Integer> positive=new ArrayList<>();
        int sum=0;
        for (Integer each : nums){
            if (each>0){
                positive.add(each);
                sum+=each;
            }
        }
        positive.add(sum);
        return positive;

    }

}

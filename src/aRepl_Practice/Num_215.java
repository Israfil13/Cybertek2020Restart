package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num_215 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(twoTimes(nums));
    }

    public static ArrayList<Integer> twoTimes (ArrayList<Integer> num){
        ArrayList<Integer> nums=new ArrayList<>();

        for (int i = 0; i <num.size() ; i++) {
            nums.addAll(Arrays.asList(num.get(i),num.get(i)));
        }
        return nums;

    }

}

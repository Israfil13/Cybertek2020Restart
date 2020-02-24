package day61;

import java.util.*;

public class CollcetionContinue {
    public static void main(String[] args) {

        Collection<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        nums.add(5);
        List<Integer> nums2=new ArrayList<>(Arrays.asList(10,7,5,9,15,66));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);
        Collections.sort((List<Integer>) nums);
        System.out.println(nums);


    }
}

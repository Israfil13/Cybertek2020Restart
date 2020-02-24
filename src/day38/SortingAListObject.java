package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println(nums);

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);


    }






}

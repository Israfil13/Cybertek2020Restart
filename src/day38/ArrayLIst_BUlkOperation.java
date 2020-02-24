package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIst_BUlkOperation {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Eggs","Milk","Butter","Apple","Salmon");
        System.out.println(groceries);
        ArrayList<String> newList=new ArrayList<>(groceries);

        newList.add("Diet Coke");
        newList.add("Sugar");

        System.out.println(newList);

        List<String> newItemstoadd=Arrays.asList("Pasta","branzini","Asparagus","Spinach");
        newList.addAll(newItemstoadd);
        System.out.println(newList);


        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        // add all nums2 items into nums1
        nums1.addAll(nums2);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);










    }
}

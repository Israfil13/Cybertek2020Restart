package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(100);
        nums1.add(122);

        nums1.removeAll(Arrays.asList(100));
//        nums1.removeAll(nums1);
        System.out.println(nums1);
        nums1.removeAll(Arrays.asList(123,300));
        System.out.println(nums1);








    }
}

package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingALIst {
    public static void main(String[] args) {

        List<Integer> nums1=new ArrayList<>(Arrays.asList(300,200,800,700,400));
        Collections.reverse(nums1);
        System.out.println(nums1);
        Collections.sort(nums1,Collections.reverseOrder());
        System.out.println(nums1);

    }
}

package Muxtar_Review.Day24_Array_Review;

import java.util.Arrays;

public class Combining2Arrays {
    public static void main(String[] args) {
        int [] nums1={1,2,3,4};
        int [] nums2={5,6,7,8};
        int [] nums3=new int[nums1.length+nums2.length];
        for (int i = 0; i <nums1.length ; i++) {
            nums3[i]=nums1[i];
        }

        for (int i = 0; i <nums2.length ; i++) {
            nums3[i+nums1.length]=nums2[i];
        }


        System.out.println(Arrays.toString(nums3));
    }
}

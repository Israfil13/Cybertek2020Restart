package day26;

import java.util.Arrays;

public class WarmUpArray {
    public static void main(String[] args) {
        int[] nums={1,5,7};
//        nums[2]=nums[0]+nums[1];
//        System.out.println(nums[2]);
        int temp=nums[0];
        nums[0]=nums[2];
        nums[2]=temp;
        int temp2=nums[1];
        nums[2]=nums[1];
        nums[1]=temp2;


        System.out.println(Arrays.toString(nums));


    }
}

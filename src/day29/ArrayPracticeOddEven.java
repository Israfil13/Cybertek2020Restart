package day29;

import day22.Array;

import java.util.Arrays;

public class ArrayPracticeOddEven {
    public static void main(String[] args) {

        int[] nums=new int[100];
        for (int i = 0; i < nums.length; i++) {

          nums[i]=(i*2)+1;

        }
        System.out.println(Arrays.toString(nums));


        String[] java=new String[100];
            String java100="I love Java";
        for (int i = 0; i <java.length ; i++) {

            java[i]= (i+1)+"I love Java";

        }
        System.out.println(Arrays.toString(java));






    }
}

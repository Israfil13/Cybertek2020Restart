package day25;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Enumeration;

public class checkArrayisSortedOrNot {
    public static void main(String[] args) {

//        int[] nums = {13,31,8,5,21,2};
//        System.out.println(Arrays.toString(nums));
//        int  numsitemcount=nums.length;
//        int[] numsCopy=new int[numsitemcount];
//        numsCopy[0] = nums[0];
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];
//
//
//        for (int i = 0; i <numsitemcount ; i++) {
//            numsCopy[i]=nums[i];
//
//        }
//        System.out.println("numsCopy = " +Arrays.toString(numsCopy) );
//
//        Arrays.sort(numsCopy);
//        System.out.println("numsCopy = " +Arrays.toString(numsCopy) );
//
//        System.out.println(Arrays.toString(nums).equals(Arrays.toString(numsCopy)));
//
//        if (Arrays.equals(nums,numsCopy)){
//            System.out.println("This Array already sorted");
//        }else{
//            System.out.println("Not Sorted");
//        }
//
//
//
//        int[] nums={12,4,32,55,2,6};
//        int [] copynums=new int [nums.length];
//        for (int i = 0; i <nums.length ; i++) {
//            nums[i]=copynums[i];
//        }
//        Arrays.sort(copynums);
//        if (copynums.equals(nums)){
//            System.out.println("this already sorted");
//        }else{
//            System.out.println("not sorted");
//        }

        int[] nums={12,4,32,55,2,6};
        int[] copynums= new int [nums.length];
        System.arraycopy(nums,0,copynums,0,nums.length);
        System.out.println(Arrays.toString(copynums));
        Arrays.sort(copynums);
        if (copynums.equals(nums)){
            System.out.println("already sorted");
        }else{
            System.out.println("not sorted again");
        }










    }

}

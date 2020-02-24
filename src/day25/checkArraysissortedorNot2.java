package day25;

import java.util.Arrays;

public class checkArraysissortedorNot2 {
    public static void main(String[] args) {

        int[]nums={8,9,10,15,21,29};
        System.out.println("nums = " + Arrays.toString(nums));
        boolean isSortedAlready=true;



        for (int i = 0; i <nums.length-1 ; i++) {
            System.out.println(nums[i]+" "+ nums[i+1]);
            System.out.println("is" + nums[i]+ "less than"+nums[i+1] + " ? " + (nums[i]<nums[i+1]));
            if (!(nums[i]<nums[i+1]))   {
                System.out.println("Array is not soerted,no need to check rest");
               isSortedAlready=false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);

    }
}

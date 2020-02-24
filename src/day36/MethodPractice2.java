package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
        long [] mylongs={6l,11l,5l,7l};
        swampFirstandLastValue(mylongs);
        System.out.println(Arrays.toString(mylongs));

      long [] myNums1=new long[5];
        System.out.println(Arrays.toString(myNums1));
      Long [] mynums=new Long[5];
        System.out.println(Arrays.toString(mynums));

    }

    public static void swampFirstandLastValue  (long [] nums){
        long temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;


    }


}

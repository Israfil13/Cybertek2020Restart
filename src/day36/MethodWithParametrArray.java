package day36;

import java.util.Arrays;

public class MethodWithParametrArray {
    public static void main(String[] args) {
        int []nums= {1,5,8,7};
        Arrays.sort(nums)  ;
        changeArrayFirstItemto100(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void  changeArrayFirstItemto100 (int[] numbers){
        numbers[0]=100;



    }

}

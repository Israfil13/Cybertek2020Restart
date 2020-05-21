package Muxtar_Review.Day25_Array;

import java.util.Arrays;

public class UniqueValue {
    public static void main(String[] args) {
        int[]nums={5,5,2,1,1,8,3};
        unique( nums );

    int [] num={121,5,88,-96,12,999,1};

    Desending(num);




    }

    public static void unique(int [] nums){

        for (int i = 0; i <nums.length ; i++) {
      int count=0;
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i]==nums[j]){
                    ++count;
                }
            }

            if (count==1){
                System.out.println(nums[i]);
            }
        }
    }

    public static void Desending(int [] num){
        Arrays.sort(num);
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }

    }



}

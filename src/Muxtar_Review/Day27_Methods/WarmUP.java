package Muxtar_Review.Day27_Methods;

import java.util.Arrays;

public class WarmUP {
    public static void main(String[] args) {
        int[]nums=new int[100];
        for (int i = 1; i <=100 ; i++) {
            nums[i-1]=i;
        }

        for (int each:nums){
            if (each%2!=0){
                continue;
            }
            System.out.println(each);
        }


    }
}

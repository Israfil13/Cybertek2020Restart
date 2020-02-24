package aRepl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
            int temp=0;
        for (int i = 0; i < nums.length-1 ; i++) {
            temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;

        }
        System.out.println(Arrays.toString(nums));




    }
}

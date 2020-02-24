package aRepl_Practice;

import java.util.Scanner;

public class Num122Unique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        for (int x = 0; x <nums.length ; x++) {
            int count=0;
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]==nums[x]){
                    ++count;
                }}
            if (count==1){
                System.out.println(nums[x]);

        }

        }

    }
}

package aRepl_Practice;

import java.util.Scanner;

public class Num136_find55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i <nums.length-1 ; i++) {
            boolean five=true;
            if (nums[i]==5){
                if ((nums[i]==nums[i+1])){
                    System.out.println(five);
                }
                }else {
                five=false;
            }   System.out.println(five);
            }


            }

        }





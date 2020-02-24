package aRepl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num141_ArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

   int[] num2=new int[nums.length*2];
        for (int i = 0; i <num2.length ; i++) {
            num2[i]=0;
        }
        num2[num2.length-1]=nums[nums.length-1];
        System.out.println(Arrays.toString(num2));




    }
}

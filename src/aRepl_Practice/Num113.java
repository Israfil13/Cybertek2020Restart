package aRepl_Practice;

import java.util.Scanner;

public class Num113 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        int sum=0;
        int counteven=0;
        int counteodd=0;
        for(int i = 0; i<nums.length; i ++){
            nums[i] = scan.nextInt();
            if (nums[i]%2==1){
                ++counteven;
            } }System.out.println(counteven);

        for(int i = 0; i<nums.length; i ++){
            if(nums[i]%2==0){
                ++counteodd;
            }

        }  System.out.println(counteodd);

    }
}

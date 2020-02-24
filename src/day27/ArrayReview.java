package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a number 5 times");
//        int [] numbers={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
//        System.out.println(Arrays.toString(numbers));

        int[]nums=new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("enter number");
            nums[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("largest " + nums[nums.length-1]);
        System.out.println("min " + nums[0]);











    }
}

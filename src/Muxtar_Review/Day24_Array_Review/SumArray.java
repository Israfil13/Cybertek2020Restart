package Muxtar_Review.Day24_Array_Review;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int[] numbers=new int[scan.nextInt()];
            int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("enter number");
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        System.out.println("sum = " + sum);
        System.out.println(sum);
    }
}

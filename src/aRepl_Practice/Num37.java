package aRepl_Practice;

import java.util.Scanner;

public class Num37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numberCoupon=scan.nextInt();
        if (numberCoupon>=3){
            System.out.println("Number of Candies: " + numberCoupon/10);
            System.out.println("Number of Gumball: " + (numberCoupon%10)/3);
        }else{
            System.out.println("Not enough coupons");
        }


    }
}

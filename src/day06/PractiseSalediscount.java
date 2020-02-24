package day06;

import java.util.Scanner;

public class PractiseSalediscount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println(" Your regular price is ");
        int regularPrice = scan.nextInt();
        System.out.println("How much discount do you have ? ");
        double discount = scan.nextDouble();
        double salePrice =regularPrice-regularPrice*discount ;
        System.out.println("Your sale price is "+ salePrice + "$");

    }
}

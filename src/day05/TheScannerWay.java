package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ;

        System.out.println("What is your name? :");
       String name= scan.next () ;
        System.out.println("Your name is " + name);

       System.out.println("What is your birth year is?: ");
      int birthYear = scan.nextInt();
      System.out.println("Your birth year is " + birthYear);

        System.out.println("How much is your height? :");
        double height=scan.nextDouble() ;
        System.out.println("Your height is"+ height);







    }
}

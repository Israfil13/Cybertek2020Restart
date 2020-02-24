package day05;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" How many days?");
        int days = scan.nextInt();
        int minutes = days * 24 * 60;
        System.out.println("There is " + minutes + " minutes in " + days + " days.");

        System.out.println("What is your hourly payment ? :");
        int hourly = scan.nextInt();
        int yearly = hourly * 2000;
        System.out.println(" Your yearly salary is " + yearly + " $ ");

        System.out.println("How many pound tomato you did you buy ? :");
        double pound = scan.nextDouble();
        double price = pound * 2.99;
        System.out.println("Your total price for tomato is " + price + "$");

        System.out.println("What about potato ? :");
        double potatoPound = scan.nextDouble();
        double potatoPrice = potatoPound * 3.49;
        System.out.println("Your total potato price is " + potatoPrice + "$");

        System.out.println(" And finally how many pound banana you got?");
        double bananaPound = scan.nextDouble();
        double bananaPrice = bananaPound * 1.99;
        System.out.println("Your total price for banana is " + bananaPrice + " $" + "\n" + "Your overall price is " + (potatoPrice +
                bananaPrice + price) + "$");


    }
}

package day10;

import java.util.Scanner;

public class Multi_Branch_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Mc Donald. Select your order");
        int itemNumber = scan.nextInt();
        String order = "";

        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order = "BUrger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order = "Ice Cream";
                System.out.println("Enjoy");
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Fries";
            default:
                System.out.println("You have selected unknown number");
                order = "unkown";
                break;

        }

        System.out.println("Your order is " + order);
    }
}
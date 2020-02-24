package aRepl_Practice;

import java.util.Scanner;

public class Num35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int cardbalance=100;
        int laptop=300;
        int socks=5;
        int blanket=60;
        if (item.equals("Laptop") && cardbalance<laptop){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Socks") && cardbalance>socks){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(cardbalance-socks)+"$");
        } else if (item.equals("Blanket") && cardbalance>blanket){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cardbalance - blanket) + "$");
        } else {
            System.out.println("Invalid item!");
        }


    }
}

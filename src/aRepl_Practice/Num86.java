package aRepl_Practice;

import java.util.Scanner;

public class Num86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter guest name");
        String guest = scan.next();
        System.out.println("Do you want to add more guest?");
        String answer = scan.next();
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest");
            guest = guest + " " + scan.next();
            System.out.println("Do you want to add more guest?");
            answer = scan.next();
        }
        System.out.println(guest);


    }
}

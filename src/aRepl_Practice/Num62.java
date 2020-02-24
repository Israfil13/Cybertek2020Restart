package aRepl_Practice;

import java.util.Scanner;

public class Num62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
       String word= scan.next();
        System.out.println("The Lenght is : "+word.length());
        System.out.println(word.charAt(word.length()-1));

    }
}

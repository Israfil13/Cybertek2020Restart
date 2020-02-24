package aRepl_Practice;

import java.util.Scanner;

public class Num119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
//        String [] email2={email};
        int count=0;
        for (int i = 0; i <email.length() ; i++) {
//            char currentchar =email.charAt(i);
            if ( '@' ==email.charAt(i)) {
                ++count;}
            }
            if (!email.contains("@") || (count >= 2)) {
                System.out.println("invalid email");
            } else {
                System.out.println("Email id: " + (email.substring(0, email.indexOf('@'))));
                System.out.println("Email domain: " + (email.substring(email.indexOf('@') + 1)));

            }


        }}
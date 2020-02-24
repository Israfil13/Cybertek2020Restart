package codenote_Practice;

import java.util.Scanner;

public class StringPractice7 {
    public static void main(String[] args) {

//        Task 7:
//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email=scan.next();
        System.out.println(email.substring(0, email.indexOf("@")));
        System.out.println(email.substring(email.indexOf("@")+1, email.indexOf(".")));
        System.out.println(email.substring(email.indexOf(".")+1));








    }
}

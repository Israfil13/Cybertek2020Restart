package codenote_Practice;

import java.util.Scanner;

public class StringPractice6 {


    public static void main(String[] args) {
//        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        char email=name.charAt(0);
       String email2=name.substring(name.indexOf(" ")+1);
        System.out.println(email+email2+"@Nightwatch.com");




    }
}
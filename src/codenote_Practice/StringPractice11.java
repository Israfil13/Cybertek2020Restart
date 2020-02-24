package codenote_Practice;

import java.util.Scanner;

public class StringPractice11 {
    public static void main(String[] args) {

//        Task 11:
//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence=scan.nextLine();

        System.out.println(sentence.substring(0,sentence.indexOf(" ")));
        System.out.println(sentence.substring(sentence.lastIndexOf(" ")+1));
        System.out.println(sentence.substring(sentence.lastIndexOf(" ")+1,(sentence.length())));


    }
}

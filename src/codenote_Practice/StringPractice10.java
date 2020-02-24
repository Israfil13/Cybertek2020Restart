package codenote_Practice;

import java.util.Scanner;

public class StringPractice10 {
    public static void main(String[] args) {
//        Task 10:
//        Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your words");
        String words=scan.nextLine();
        System.out.println(words.substring(words.indexOf(" ")+1,words.indexOf(" ",words.indexOf(" ")+1)));






    }
}

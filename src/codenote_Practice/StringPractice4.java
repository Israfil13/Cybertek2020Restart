package codenote_Practice;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {
//        Task 4:
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=scan.next();
        int lastchar=word.length()-1;
        int middlechar=word.length()/2;
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(lastchar));
        System.out.println(word.charAt(middlechar));




    }
}

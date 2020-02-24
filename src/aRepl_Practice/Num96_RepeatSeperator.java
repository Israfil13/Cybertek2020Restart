package aRepl_Practice;

import java.util.Scanner;

public class Num96_RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int wordcount = 0;
        for (int i = 1; i <= count; i++) {
            if (i == count) {
                System.out.print(word);
            } else {
                System.out.print(word + separator);

            }

        }
    }}

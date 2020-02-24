package day19;

import java.util.Scanner;

public class HomeworkChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your starting and ending characters");
        String start = scan.next();
        String end = scan.next();
        char startchar = start.charAt(0);
        char endchar = end.charAt(0);

        if (startchar < endchar) {

            for (char ichar = startchar; ichar <= (endchar); ichar++) {

                System.out.println(ichar);
            }
        } else if (startchar > endchar) {
            for (char ichar = startchar; ichar >= (endchar); ichar--) {

                System.out.println(ichar);
            }


        }
    }}

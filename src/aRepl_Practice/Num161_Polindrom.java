package aRepl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num161_Polindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        int reversed=0;
        int firstnum=num;
        while (num>0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }


        System.out.println(firstnum==reversed);




    }


}

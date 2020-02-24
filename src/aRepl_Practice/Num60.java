package aRepl_Practice;

import java.util.Scanner;

public class Num60 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        int result =(x>=5)? x:0;
        int result2=(x<5)?x:0;
        System.out.println(x);



    }
}

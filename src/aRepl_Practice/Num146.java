package aRepl_Practice;

import java.util.Scanner;

public class Num146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1=scan.nextInt();
        System.out.println("enter second number: ");
        int num2=scan.nextInt();
        plus(num1,num2);
    }
    public static void plus(int num1,int num2){
        System.out.println(num1+num2);
        //your code here
    }


}

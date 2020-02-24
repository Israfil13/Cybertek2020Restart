package aRepl_Practice;

import java.util.Scanner;

public class Num32 {
    public static void main(String[] args) {

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter seconds: ");
//        int inputSeconds=scan.nextInt();
//        int hours=inputSeconds/3600;
//        int minutes=(inputSeconds%3600)/60;
//        int seconds=(inputSeconds%3600)%60;
//        System.out.println(hours+" hours"+", "+minutes + " minutes"+" and "+seconds+" seconds");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int milligrams=scan.nextInt();
        int drinknum=10*1000/milligrams;
        System.out.println("It would take about "+drinknum+" drinks for a lethal overdose");

    }
}

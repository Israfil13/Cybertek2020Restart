package aRepl_Practice;

import java.util.Scanner;

public class Num39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int value1=1100;
        int value2=1850;
        int value3=2550;
        if (numberOfBedrooms==1){
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: "+value1);
        }else if (numberOfBedrooms==2) {
            System.out.println("Two Bedroom Selected");
            System.out.println("Starting Price: "+value2);
        }else if (numberOfBedrooms==3) {
            System.out.println("Three Bedroom Selected");
            System.out.println("Starting Price: "+value3);
        }else{
            System.out.println("No such Bedrooms available");
        }





}}

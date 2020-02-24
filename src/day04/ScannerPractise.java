package day04;

import java.util.Scanner;

public class ScannerPractise {

    public static void main(String[] args) {

        Scanner temperature = new Scanner(System.in);

        System.out.println("Current temperature in Farenheit :" ) ;
        double Farenheit = temperature.nextDouble();
        System.out.println("You have entered" + Farenheit+ " F ");

        double Celsius ;
        Celsius= (5.0 / 9) * (Farenheit-32) ; ;
        System.out.println("Current temperature in Celsius is "+ Celsius+ "C");






    }
}

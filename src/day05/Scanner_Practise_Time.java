package day05;

import java.util.Scanner;

public class Scanner_Practise_Time {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println(" What is the temperature in F ?");
//        double farenheit= scan.nextDouble();
//
//        double celsius = (5.0 / 9) * (farenheit-32) ;
//        System.out.println(" Current temperature in Celsius is "+ celsius);

//        System.out.println("Number of day? ;");
//        double countDay = scan.nextDouble();
//        double min = countDay*24*60 ;
//        System.out.println("There is "+ min);

//        System.out.println("WHat is your hourly wage? :");
//        int hourly = scan.nextInt();
//        int yearly = hourly*2000 ;
//        System.out.println(" Your yearly salary is " + yearly);

        System.out.println("what is price of potato");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many you wanna buy ? ");
        int countPotato = scan.nextInt();
        System.out.println("your total potato price is" + (potatoPrice * countPotato));


    }
}


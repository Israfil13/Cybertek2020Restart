package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Season");
         String season = scan.next();
        if ( season.equalsIgnoreCase("spring")) {
            System.out.println("I do Hiking,Novruz,Cool weather");
        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("I do Swimmig, walking ,Birtday");
        }else if (season.equalsIgnoreCase("FALL")){
            System.out.println("I do Riding,Barbecue,Hallowen");
        }else if (season.equalsIgnoreCase("WinTer")){
            System.out.println("I do Code,SKii,Snow ball");
        }else {
            System.out.println("CODE CODE CODE");
        }



    }
}

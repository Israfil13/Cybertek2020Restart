package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the season?");

        String season = scan.next();
        switch (season) {

            case "Fall":
                System.out.println("Black friday,Hiking,Harvest");

                break;
            case "Summer":
                System.out.println("Swim Vacation Grandma");
                break;
            case "Spring":
                System.out.println("Novruz Blossom");
                break;
            case "Winter":
                System.out.println("Ski new year");
                break;
            default:
                System.out.println("season is unknown");
        }



    }
}

package aRepl_Practice;

import day05.ScannerPractise_NextBoplean;

import java.util.Scanner;

public class Num36 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter current count for seniorCitizens and nonSeniorCitizens:");
        System.out.println( "What is new citizen's age?");
        int seniorCitizens= scan.nextInt();
        int nonSeniorCitizens=scan.nextInt();
        int age=scan.nextInt();
        if (age>=65){
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens count "+(++seniorCitizens));
        }else if (age<=65){
            System.out.println("Non-Senior Citizen");
            System.out.println("New nonSeniorCitizens count "+(++nonSeniorCitizens));
        }

    }
}

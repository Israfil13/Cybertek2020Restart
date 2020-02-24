package day09;

import java.util.Scanner;

public class HomeWork_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Which number of the meal you want from menu?");
        int meal=scan.nextInt();
        String yourChoise="";

        switch (meal){
            case 1:
                yourChoise="Lule";
                break;
            case 2:
                yourChoise="Tike";
                break;
            case 3:
                yourChoise="Basdirma";
                break;
            case 4:
                yourChoise="Xash";
                break;
            default:
                System.out.println("Sorry we do not have this dish in the menu");

        }
        System.out.println("Your choise is "+ yourChoise+ "\nBon Apetit !!!");






    }
}

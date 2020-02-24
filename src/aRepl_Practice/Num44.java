package aRepl_Practice;

import java.util.Scanner;

public class Num44 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=scan.nextInt() ;

//        less than 2, ineligible
//        2, toddler
//        3-5, early childhood
//        6-7, young reader
//        8-10, elementary
//        11 and 12, middle
//        13, impossible
//        14-16, high school
//        17-18, scholar
//        greater than 18, ineligible


        if (age<2){
            System.out.println("ineligible");
        }
        if (age==2){
            System.out.println("toddler");
        }
        if (age<=5&&age>=3){
            System.out.println("early childhood");
        }
        if (age<=7&&age>=6){
            System.out.println("young reader");
        }
        if (age<=10&&age>=8){
            System.out.println("elementary");
        }
        if (age<=12&&age>=11) {
            System.out.println("middle");
        }
        if (age==13){
            System.out.println("impossible");
        }
        if (age <= 16&&age>=14) {
            System.out.println("high school");
        }
        if (age<=18&&age>=17){
            System.out.println("scholar");
        }
        if (age>18){
            System.out.println("ineligible");
        }


    }
}

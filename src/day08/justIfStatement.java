package day08;

import java.util.Scanner;

public class justIfStatement {
    public static void main(String[] args) {

        int speedlimit = 60 ;

        Scanner scan= new Scanner(System.in);
        System.out.println(" What is your current speed ?: ");
        int currentspeed = scan.nextInt();

        if (currentspeed>=speedlimit) {
            System.out.println( "You gonna get he ticket") ;
            System.out.println( "Slow down !!") ;

        }
        System.out.println("The end of story!! Move on!!");


        System.out.println("What is your height?");
        double height=scan.nextDouble();
        if (height<1.5){
        System.out.println("You are not eligible to army ");}

        System.out.println("Go to Army");

        String name="pumpkin";
        name.toUpperCase();
        System.out.println(name);





    }
}

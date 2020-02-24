package day08;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int speedlimit = 60;
        System.out.println("What is your speed ?");
        int currentspeed = scan.nextInt();
        boolean amIspeeding = currentspeed > speedlimit;
        System.out.println(amIspeeding);

//
//      if(currentspeed>speedLimit)
//      if(false)
//      if (true)
        if (amIspeeding) {
            System.out.println(" You gonna get ticket  ");
            System.out.println(" Slow down !!  ");
        } else {
            System.out.println("Good job");

        }

        int point = 95;
        if (point>=93) {
            System.out.println( "Milan will be champion");
        }else {
            System.out.println("Next season");
        }




    }
}

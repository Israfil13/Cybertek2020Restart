package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.println("What is your score?");
//        int score=scan.nextInt();
//
//        if (score<0 || score>100)  {
//            System.out.println("INVALID SCORE");
//        }else if (score==100){
//            System.out.println("PERFECT");
//        }else if (score>70 && score<100 ){
//            System.out.println("YOU HAVE PASSED");
//        }else if (score<20){
//            System.out.println("COME TO MY OFFICE");
//        }else if (score>30 && score<40){
//            System.out.println("ATTEND ADDITIONAL CLASSES");
//        }else if (score>40 && score<70) {
//            System.out.println("LITTLE BIT MORE STUDY WILL LET YOU PASS ");
//        }else {
//            System.out.println("YOU HAVE Failed");
//        }


        System.out.println("How many points do you have?");
        int point=scan.nextInt();
        if(point<0 || point>116){
            System.out.println("Invalid point");
        } else if (point>=105);{
            System.out.println("Record");
        }






    }
}

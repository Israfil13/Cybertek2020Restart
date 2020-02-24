package day05;

import java.sql.SQLOutput;

public class VariablePractise {
    public static void main(String[] args) {


        int birthYear = 1990 ;
        int currentYear = 2019 ;

        System.out.println(" I was born in "+ birthYear+ " and I am  " + (currentYear-birthYear) + " years old.");

        int speedLimit= 60 ;
        int currentSpeed = 70 ;
        int overLImit= currentSpeed-speedLimit ;

        System.out.println("Today my current speed was" + currentSpeed +"mph " +
                "Speed limit was " +speedLimit +"mph"+" So I was overspeedig " + overLImit +"mph");






    }
}

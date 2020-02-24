package day09;

import java.util.Scanner;

public class HomeWorkPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much selsium gonna be tomorrow");
        int temperature = scan.nextInt();

        if (temperature < 10) {
            System.out.println("You have to wear coat");
        }else  if (temperature<20)
            System.out.println("You have to wear jacket");





        int leguePosition=3;
        String tournamnet = "";
        if (leguePosition==1){
            tournamnet="CHhampions Legue 1";
        }else if(leguePosition==2){
        tournamnet="CHampions legaue 2"; }
        else if (leguePosition==3){
            tournamnet="Euro Legue";}
        System.out.println("If my team be in " +leguePosition+" position it will go to "+ tournamnet);




        }









    }
















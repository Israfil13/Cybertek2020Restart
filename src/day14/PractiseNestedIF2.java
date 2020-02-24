package day14;

import java.util.Scanner;

public class PractiseNestedIF2 {
    public static void main(String[] args) {

//        String season = "winter";
//        if (season.equals("spring") || season.equals("fall") || season.equals("spring")) {
//            System.out.println("bear are active");
//        }else if (season.equals("winter") ) {
//            System.out.println("bears are sleep");
//    }
//
//            switch (season) {
//                case "spring" :
//                case "fall":
//                case "summer":
//                    System.out.println("Bears are active");
//                    break;
//                case "winter":
//                    System.out.println("Bear are sleeping");


   // }
        Scanner scan=new Scanner(System.in);
        System.out.println("Car model?");
        String car= scan.next();
        if (car.equalsIgnoreCase("Honda") || car.equalsIgnoreCase("Toyota") || car.equalsIgnoreCase("Lexus")) {
            System.out.println("ASIAN");
        }else if (car.equalsIgnoreCase("BMW")||car.equalsIgnoreCase("MB")||car.equalsIgnoreCase("AUDI")){
            System.out.println("German");
        } else {
            System.out.println("JIQULI");
        }

















}}

package day12;


import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {
        String weather = "Sunny";

        if (weather.equals("Sunny")) {
            System.out.println("Code in Sunny weather");}
        else if ( weather.equals("Rainy")){
            System.out.println("COde in Rainy weather");
        }else if (weather.equals("Cloudy")){
            System.out.println("Code in CLoudy weather");
        } else if (weather.equals("Snowy")){
            System.out.println("Code in Snowy");
        }else {
            System.out.println("Keep coding"); }



        int month = 12;

        if (month < 1 || month > 12) {
            System.out.println("INvalid MOnth");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("SUmmer");
        } else if (month >=9 && month <= 11) {
            System.out.println("Fall");
        } else if (month == 1 || month == 12 || month == 2) {
            System.out.println("Winter");
        }

        //since first condition is already taking out invalid situation we do not need else in this code
        //else in general is optional









    }
}
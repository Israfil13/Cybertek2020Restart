package aRepl_Practice;

import java.util.Scanner;

public class Num157_Time_Converter {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion("12:00:00PM");

        }

    public static void timeConversion(String s) {
//        if (s.contains("PM")&&s.contains("12:00:00")){
//            System.out.println("00:00:00");
//        }

        if (s.contains("PM")){
            if (s.contains("12")){
                s=s.replace("12","00");
                String[] arrPM=s.split(":");
                int hour=Integer.parseInt(arrPM[0])+12;
                System.out.println(hour+":"+arrPM[1]+":"+arrPM[2].replace("PM",""));
            }else{
            String[] arrPM=s.split(":");
            int hour=Integer.parseInt(arrPM[0])+12;
            System.out.println(hour+":"+arrPM[1]+":"+arrPM[2].replace("PM",""));}


    }   if (s.contains("AM")){
            System.out.println(s.replace("AM",""));
        }




    }

    }





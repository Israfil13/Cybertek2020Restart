package day15;


import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {

        String name="Israfil";
       int nameLenght =  name.length();
        if (nameLenght < 4) {
            System.out.println("Short Name");
//        }else if (nameLenght>5 && nameLenght<11)
        }else if ( nameLenght<=11)
        {
            System.out.println(" Medium Name");
        }else  if (nameLenght>11){

            System.out.println("Longer Name");
        }


        if (name.contains("a") || name.contains("e")){
            System.out.println("Name contains a or e");
        }else {
            System.out.println(" I dont have both A or E in mmy name");
        }


        Scanner scan=new Scanner(System.in);
        System.out.println(" chose a word");
        String word=scan.next();
        int wordlenght=word.length();

        if(wordlenght<5) {
            System.out.println("short word");
        }else if (wordlenght<=15){
            System.out.println("Medium word" );
        }else  if (wordlenght>15) {
            System.out.println("complex word");
        }


    }
}

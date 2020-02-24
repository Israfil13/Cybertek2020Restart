package day15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Reviiew {
    public static void main(String[] args) {

        String message =  "  ABC  ";
        System.out.println(message.length());
         message= message.trim();
        System.out.println("message = " + message);;
        System.out.println("messageTrimed = " + message.length());
        System.out.println(message.isEmpty());
        String meme="lllll";
        System.out.println(meme.isBlank());
        String java = "I love Java";
        System.out.println("Lasn location of e"+ java.lastIndexOf("a"));
        boolean messagcontain= java.contains("love");
        System.out.println("messagcontain = " + messagcontain);;


        String dd=" ";
        System.out.println(dd.isEmpty());
        System.out.println(dd.isBlank());




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

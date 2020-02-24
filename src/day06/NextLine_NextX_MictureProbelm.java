package day06;

import java.util.Scanner;

public class NextLine_NextX_MictureProbelm {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name= blabla.nextLine();


        System.out.println("What is your age? ");
       int age=blabla.nextInt();

      blabla.nextLine();


        System.out.println("What is your adress? ");
        String adress=blabla.nextLine();

        System.out.println("Your name is "+name);
        System.out.println( "You are"+age);
        System.out.println("yOur adress is"+adress);

    }
}

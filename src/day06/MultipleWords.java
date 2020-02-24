package day06;

import java.util.Scanner;

public class MultipleWords {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = blabla.nextLine();
        // nextLine method of Scanner is used to capture whole line
        System.out.println("Where do you live ?");
        String adress = blabla.nextLine();
        System.out.println("What is your street adress?");
        String street = blabla.nextLine();

        System.out.println( "You have entered " + name + " Your adress is "+ adress + "Street adress"+ street);

    }
}

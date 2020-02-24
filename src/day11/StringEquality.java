package day11;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Israfil"; //String literal
        String name2= new String( "Israfil");
        String name3= "Israfil";

        System.out.println(name);
        System.out.println(name2);
        //  The correct way of comparing String to get consistent result is
        // using one of the String object behaviour / method called
        // equals method
        System.out.println(name==name3);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        // BOTTOM LINE IS : DO NOT EVER USE == TO CHECK STRING EQUALITY

    }
}

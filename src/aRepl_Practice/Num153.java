package aRepl_Practice;

import java.util.Scanner;

public class Num153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

    String [] sSplit=info.split(",");
        System.out.println("person name: "+sSplit[0]+" "+"last name: "+sSplit[1]+" "+"age: "+sSplit[2]);



    }
}

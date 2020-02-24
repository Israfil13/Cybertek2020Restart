package day07;

import java.util.Scanner;

public class Pracrise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name, Last name, Company ");

        String firstName= scan.next();
        String lastname = scan.next();
        String company = scan.next() ;



//        String firstName = "Israfil";
//        String lastName = "Hajiyev";
//        String company = "ABZ";
       String email = firstName+"_"+lastname+"@"+"company.com";
       System.out.println("My name is "+ firstName+" "+lastname+"."+ "I work for "+ company+" and" + "my email is " + email );

    }
}

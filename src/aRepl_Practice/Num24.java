package aRepl_Practice;

import java.util.Scanner;

public class Num24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName= scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        Long workNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        Long personalNumber = scan.nextLong();
        System.out.println("Enter age");
        int age = scan.nextInt();
        System.out.println("Enter height");
        double height = scan.nextDouble();
        System.out.println("Enter weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married");
        boolean married=scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Address: "+street+", "+city+", "+state+" "+zipCode);
        System.out.println("Contacts: "+ "work phone number - "+workNumber+", personal phone number - "+personalNumber+", email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married: "+married);


    }
}

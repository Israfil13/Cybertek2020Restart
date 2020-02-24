package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter password");
        String password=scan.next();
      int i=1;

        while(!password.equals("B15") && i<3){
            System.out.println("Wrong Password,Try Again");
            System.out.println("You have left "+(3-i)+"attempts");
            ++i;
            password=scan.next();

        }if (i==3){
            System.out.println("locked");
        }

        System.out.println("Open sesame");







    }
}

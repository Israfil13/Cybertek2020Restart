package day18;

import java.util.Scanner;

public class SmartLock_Do_While_version {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter password");
       String password;
        do { System.out.println("Enter password");
              password=scan.next();
        }while (!password.equals("B15"));{

        }




    }
}

package aRepl_Practice;

import java.util.Scanner;

public class Num23 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Put your arecode and local number");
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();
        String phoneNumber=("("+areaCode+")"+" "+localNumber);
        System.out.println("Calling number " + phoneNumber);





    }
}

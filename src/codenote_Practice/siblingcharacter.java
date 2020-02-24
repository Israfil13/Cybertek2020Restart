package codenote_Practice;

import java.util.Scanner;

public class siblingcharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the name");
        String name=scan.next();
        for (int i = 0; i < name.length()-1; i++) {
            System.out.println(name.substring(i,i+2));

        }




    }
}

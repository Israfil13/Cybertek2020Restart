package day14;

import java.util.Scanner;

public class PractiseNestedIF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You want food or not");
        String mainoption = scan.next();


    if (mainoption.equalsIgnoreCase("Food")) {

        System.out.println("You have selected food");
        System.out.println("You wanr meal or sncak");
        String secondaryOption =scan.next();
        if (secondaryOption.equalsIgnoreCase("snack")) {

            System.out.println("You have selected snack");
        } else if (secondaryOption.equalsIgnoreCase("meal")) {
            System.out.println("You have selected meal");
        } else {
            System.out.println("No food selected");
        }
    }else{
        System.out.println("No food selected");
    }


    }
}

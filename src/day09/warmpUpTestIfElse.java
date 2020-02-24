package day09;

import java.util.Scanner;

public class warmpUpTestIfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number :");
        int yournumber=scan.nextInt();


    if (yournumber%2==0){
            System.out.println("Your number is even");
        }
        else {
            System.out.println(" your number is odd");
        }



        String citizenType ;

        System.out.println("How old are you?");
        int age=scan.nextInt();

        if(age>65){
            citizenType="Senior";
        }else{
            citizenType="Not Senior";

        }

        System.out.println("The ciizen age is"+age+"and he is " + citizenType);












    }
}

package day12;

import java.util.Scanner;

public class FizzBuzzNUmberChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("My number");
        int num=scan.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("FizzBUZZ Number");
        }else if (num%3==0){
            System.out.println("Buzz Number");
        } else if (num%5==0)
        {  System.out.println("Fizz Number");
        }
        else {
            System.out.println("Not My number");
        }






    }

}

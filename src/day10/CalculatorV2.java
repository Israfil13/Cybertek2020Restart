package day10;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        char operator = scan.next().charAt(0);

        //char operator = '*';
        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;

            case'-':
                System.out.println(num1-num2);
                break;

            case'*':
                System.out.println(num1*num2);
                break;

            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");



        }



    }
}

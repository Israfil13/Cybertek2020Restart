package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator = '/';


        switch (operator) {
            case '+':
                System.out.println("You are about yhe add number");
                break;
            case '/':
                System.out.println("You are about yhe divide number");
                break;
            case '-':
                System.out.println("You are about yhe deduct number");
                break;
            case '*':
                System.out.println("You are about yhe multiple number");
                break;

            default:
                System.out.println("Invalid operator");

        }


    }


}

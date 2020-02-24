package day08;


import java.util.Scanner;

public class warmUpTask {
    public static void main(String[] args) {

        int age = 21;
        System.out.println( age>=18);

        if (age>=18)
        System.out.println("You are ready to vote");

        else
            System.out.println(" Wait until 18");


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite number? :");
        int favNumber = scan.nextInt();

        System.out.println("Guess my fav number? :");
        int yourGuess=scan.nextInt();

        if (favNumber==yourGuess){
            System.out.println(" BINGO !!!");}
        else {
            System.out.println("Sorry Try again");
        }










    }
}

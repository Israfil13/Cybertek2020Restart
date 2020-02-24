package day10;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        String myAnswer="";
        int myNumber=15;

        if(myNumber%5==0){
        myAnswer="Fizz Number" ;
        }else {
            myAnswer="not Fizz Number";
        }
        System.out.println("My number " + myNumber+ " and it is " + myAnswer);


        String myanswer="";
        Scanner scan=new Scanner(System.in);
        int mynumber=scan.nextInt();

        if(mynumber%2==0){
            System.out.println(myAnswer=" zero ");
        }else {
            System.out.println(myAnswer= "remiander");
        }




    }
}

package aRepl_Practice;

import java.util.Scanner;

public class Num155 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
    count(num);

    }


    public static void count (int num){
        for (int i = num+1; i <num+4 ; i++) {
            System.out.println(i);
        }


    }





}

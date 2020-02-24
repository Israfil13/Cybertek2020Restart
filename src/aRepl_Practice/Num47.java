package aRepl_Practice;

import java.util.Scanner;

public class Num47 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        if (num%2==0){
            System.out.println(num+" is even");
        }else if (num%2!=0){
            System.out.println(num+ " is odd");
        }
    }
}

package aRepl_Practice;

import java.util.Scanner;

public class Num34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice=scan.nextInt();
        int quartes=itemPrice/25;
        int dimes=itemPrice/10;
        int nickels=itemPrice/5;
        if(itemPrice<100&&itemPrice>25&&itemPrice%5==0){
            System.out.println("Your change is "+ quartes+" quartes"+", "+dimes+" dimes"+", and "+
                    nickels+" nickels");
    }}
}

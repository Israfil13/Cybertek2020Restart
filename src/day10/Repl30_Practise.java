package day10;

import java.util.Scanner;

public class Repl30_Practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price");
        String item1=scan.next();
        int count1=scan.nextInt();
        double price=scan.nextDouble();

        System.out.println("Enter Item2, count and its price");
        String item2=scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();

        System.out.println("Enter Item3, count and its price");
        String item3=scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();

                double item1Total= price*count1;
                double item2Total= price2*count2;
                double item3Total= price3*count3;
        double totalPrice = item1Total+item2Total+item3Total;
         String report="jj";
        if(count1>0){
            report="Item1: "+item1+" Price :"+totalPrice;
        }







    }
}

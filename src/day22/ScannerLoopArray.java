package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int[]numbers=new int[3];
        for (int i = 0; i<=numbers.length-1 ; i++) {
            System.out.println("ENter your number " + (i+1));
            numbers[i]=scan.nextInt();

        }
        for (int i = 0; i<=numbers.length-1 ; i++) {
            System.out.println(numbers[i]);
            sum=sum+numbers[i];

    }System.out.println("Sum" + sum);

//
//



    }
}

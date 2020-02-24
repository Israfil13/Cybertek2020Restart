package day19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWorkSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter start and end number");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int sum=0;
        for (int i = start; i <=end ; i++) {
            sum=sum+i;

        }
        System.out.println(sum);
    }

}

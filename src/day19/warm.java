package day19;

import java.util.Scanner;

public class warm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter start and end speed");
        int start=scan.nextInt();
        int end=scan.nextInt();
//        int start=10;
//        int end=27;
        for (int i= start;i<=end;++i){
            System.out.println("start" +i);
        }

    }
}

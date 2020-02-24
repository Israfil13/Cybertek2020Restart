package day22;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

//       String[] household=new String[4];
//        Scanner scan=new Scanner(System.in);
//        String household1=scan.nextLine();
//        System.out.println("Enter names");
//        household[0]=household1;
//        String household2=scan.nextLine();
//        household[1]=household2;
//        String household3=scan.nextLine();
//        household[2]=household3;
//        String household4=scan.nextLine();
//        household[3]=household4;

//
//        for (int i = 0; i <=3 ; i++) {
//            System.out.println(household[i]);
//        }

        String[] household=new String[4];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <household.length ; i++) {
            System.out.println("Enter household name");
           household[i]=scan.nextLine();

        }
        for (int i = 0; i <household.length ; i++) {
            System.out.println(household[i]);
        }





    }
}

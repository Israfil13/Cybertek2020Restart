package aRepl_Practice;

public class Num150 {
    public static void main(String[] args) {
    printHollowRect();
    }

    public static void printHollowRect(){


        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=5 ; j++) {
               if (i==1 || i==5){
                   System.out.print("*");
                   if (i!=1 || i!=5){
                       System.out.println("*");
                   }
               }



        }

            System.out.println();



    }

}}

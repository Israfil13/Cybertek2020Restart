package aRepl_Practice;

import java.util.Scanner;

public class Num87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
       int day=0;
       while(inhabitants>0){
           System.out.println("Day " + day +" "+ "["+inhabitants+"]");
            inhabitants=inhabitants/2;
            ++ day;


        }

            


        }
    }


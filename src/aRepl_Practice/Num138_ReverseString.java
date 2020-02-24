package aRepl_Practice;

import java.util.Scanner;

public class Num138_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

       String reversed = "";
        //TODO: start your code here
      String [] reversedarr=sentence.split(" ");
        for (int i = reversedarr.length-1; i >=0 ; i--) {
            if (i==reversedarr.length){
            reversed+=reversedarr[i];
            }else {
                reversed+=reversedarr[i]+" ";
            }

        }



        //End your code here. do not modify below statement
        System.out.println(reversed);



    }
}

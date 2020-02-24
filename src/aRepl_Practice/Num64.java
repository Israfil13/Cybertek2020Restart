package aRepl_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Num64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()%2!=0){
            if (word.length()==1){
                System.out.println(word+word+word);
            }else{
                System.out.println(word.charAt(word.length()/2));
            }

            }
        if (word.length()%2==0){
            if (word.length()==2){
                System.out.println(word+word);
            }else {
                System.out.println(""+word.charAt((word.length()/2)-1)+word.charAt(word.length()/2));
            }

        }
    }
}

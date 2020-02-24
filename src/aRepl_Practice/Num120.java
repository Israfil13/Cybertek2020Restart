package aRepl_Practice;

import java.util.Scanner;

public class Num120 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String max=" ";
        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {
            words[i] = scan.nextLine();

        }

        for (int j = 0; j <words.length ; j++) {
            if (words[j].length()>max.length()){
                max=words[j];
        }

        }

        System.out.println(max);
}}

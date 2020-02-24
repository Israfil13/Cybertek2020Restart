package aRepl_Practice;

import day22.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Num140_Arrays {
    public static void main(String[] args) {
        String[] za={};
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int k = 0; k <words.length ; k++) {
              words[k]=(""+words[k].charAt(0)+words[k].charAt(words[k].length()-1));


        }
        System.out.println(Arrays.toString(words));




    }
}

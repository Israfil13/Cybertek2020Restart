package day24;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrayScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String l1=scan.next();
        String l2=scan.next();
        String l3=scan.next();


        String[]language= {l1,l2,l3};
        System.out.println(language[2]);
        System.out.println(Arrays.toString(language));
        for (String program:language){
            System.out.println(program);
        }

        for (int i = 0; i <3 ; i++) {
            System.out.println(language[i]);

        }

    }
}

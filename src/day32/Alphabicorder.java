package day32;

import javax.swing.*;

public class Alphabicorder {
    public static void main(String[] args) {
    aphabetic('A','a');
    aphabetic('H','A');

    }

    public static void aphabetic(char beginning,char ending){
        if (beginning<ending){
            for (char i = beginning; i <=ending ; i++) {
                System.out.print(i);
            }

        }else if (beginning>ending){
            for (char i = beginning; i >=ending ; i--) {
                System.out.print(i);
            }
        }
        System.out.println();
    }


}

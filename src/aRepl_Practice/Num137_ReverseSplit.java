package aRepl_Practice;

import java.util.Scanner;

public class Num137_ReverseSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

            String [] arrsentemce=sentence.split(" ");
            for (int i = arrsentemce.length-1; i >=0 ; i--) {
                System.out.println(arrsentemce[i]);
            }




    }
}

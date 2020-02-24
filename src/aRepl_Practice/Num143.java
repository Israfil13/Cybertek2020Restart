package aRepl_Practice;

import java.util.Arrays;

public class Num143 {
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j=j+j) {
                System.out.print(i+""+j);
            }
            System.out.println();
        }

        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
//        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}

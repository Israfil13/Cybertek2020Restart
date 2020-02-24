package aRepl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num170_Array_Zombie_Attack {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }
        int[]inhabitants={3,6,0,4,3,2,7,0};

        for (int j = 0; j <inhabitants.length ; j++) {
            for (int i = 1; i <inhabitants.length -1; i++) {
                if ( inhabitants[i+1]==0 || inhabitants[i-1]==0 ){
                    inhabitants[i]=inhabitants[i]/2;
                    System.out.println(Arrays.toString(inhabitants));
                }


            }

        }




    }
}

package aRepl_Practice;

import java.util.Scanner;

public class Num152 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

        public static void plus_minus( int[]arr ){
            int positivies=0;
            int negatives=0;
            int zeros=0;
            for (int eachnum:arr){
                if(eachnum>0){
                    ++positivies;
                }else if (eachnum<0){
                    ++negatives;
                }else if (eachnum==0){
                    ++zeros;
                }
            }

            System.out.println("positivies: "+positivies+","+"negativeszeros: "+negatives+","+"zeros :" + zeros);



        }



}

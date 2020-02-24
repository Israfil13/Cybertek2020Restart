package codenote_Practice;

import javax.swing.*;

public class Practice_Finra {
    public static void main(String[] args) {
//        for (int i = 1; i <=30 ; i++) {
//
//            if(i%3==0){
//                System.out.print("Fin");
//            }else if (i%5==0){
//                System.out.print("Ra");
//            }else if (i%3==0 && i%5==0){
//                System.out.print(" Finra ");
//            }else{
//                System.out.print(" "+i+" ");
//            }
//
//        }
            int num1=21;
            int num=3;
            int count=0;
        for (int i = 0; i < num1; i++) {
         if (num1==0){
            break;
            }
            if (num1>num){
                num1=num1-num;
                ++count;}
        }



        System.out.println(count+1);


    }

}

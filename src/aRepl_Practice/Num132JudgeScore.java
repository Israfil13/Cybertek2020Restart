package aRepl_Practice;

import java.util.Scanner;

public class Num132JudgeScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float total=0;

        for (int i = 0; i <score.length ; i++) {
            System.out.println("Enter score for judge "+(i+1));
            score[i]=input.nextLong();}

        float max=0;
        float min=score[0];

        for (int i = 0; i <score.length ; i++) {


            if (max<score[i]){
                max=score[i];
            }
            if (min>=score[i]){
                min=score[i];

            }
            total+=score[i];
        }


        System.out.println("Enter difficulty");
        float point=input.nextFloat();
        if (point>=1.2 && point<=3.8){
            total=total-max-min;
            total = total*point*0.6f;
        }else{
            System.out.println("Invalid Point");
        }
        System.out.printf("Total: %.2f", total);



    }
}

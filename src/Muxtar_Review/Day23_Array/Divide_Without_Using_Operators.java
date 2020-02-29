package Muxtar_Review.Day23_Array;

import java.util.Scanner;

public class Divide_Without_Using_Operators {
    public static void main(String[] args) {

//        How to divide 2 integer whitout using / or %
//        Scanner scan=new Scanner(System.in);
//        int[] inputs=new int[10];
//        for (int i = 0; i <inputs.length ; i++) {
//            inputs[i]=scan.nextInt();
//        }


        int num1 = -20;
        int num2 = -2;
      int A,B;
      if (num1>num2){
          A=num1;
          B=num2;
      }else if (num2>num1){
          A=num2;
          B=num1;
      }

        int result = 0;
        if (num2 != 0) {
            while (num1 > num2) {
                num1 -= num2;
                ++result;
            }
            System.out.println("deviision is:" + result + "and remainder is " + num1);
        }else{
            System.out.println("Invalid entry");
        }



    }
    public static void divide(int num1,int num2){
        int result=0;
        if (num1!=0){
            while (num1>num2){
                num1-=num2;
                ++result;
            }
        }else{
            System.out.println("Invallid entry");
        }
    }
}
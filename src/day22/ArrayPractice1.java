package day22;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[]prices=new double[5];
       //cannot print array variable directly too see whats inside
        System.out.println(prices);

  prices[0]=2.46;
  prices[1]=12.96;
  prices[2]=990.2;
  prices[3]=500;
  prices[4]=65.122;
        for (int i = 0; i <=4 ; i++) {
            System.out.println(prices[i]);
        }




        char[]name=new char[7];
        name[0]='I';
        name[1]='S';
        name[2]='R';
        name[3]='A';
        name[4]='F';
        name[5]='I';
        name[6]='L';
        for (int i = 0; i <=6 ; i++) {
            System.out.println(name[i]);
          //  System.out.println(name);

        }


        boolean[]yesNo=new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


        yesNo[0]=true;
        yesNo[1]=true;
        yesNo[2]=10<7;


        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);







    }
}

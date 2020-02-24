package day32;

import org.w3c.dom.ls.LSOutput;

import java.util.DoubleSummaryStatistics;

public class Practice {
    public static void main(String[] args) {
        numberComparision(14,14);
        evencount();
        strRepeat("Hello World",3);
        skip3();
        print1tox(5);
        evenxtoy(15,6);
    }


        public static void numberComparision(int num1,int num2){
        if (num1>num2){
            System.out.println("num1 is more than num2");
        }else  if ((num2>num1)){
            System.out.println("num2 is more than num1");
        }else
        {           System.out.println("numbers are same");}
            System.out.println();
        }



        public static void strRepeat(String repeat,int count) {

                    for (int i = 1; i <=count ; i++) {

            }      System.out.println(repeat);

        }

        public  static  void evencount () {
//            for (int i = 50; i >=1 ; i--) {
//                if (i%2==0){
//                    System.out.print(i+" ");
//                }
//            }
//            System.out.println();
            evenxtoy(50,0);
        }

        public static void evenxtoy(int num1,int num2){
            for (int i = num1; i>=num2 ; i--) {
                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        }








        public static void print1tox(int x){
            for (int i = 1; i <=x ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        public static void skip3(){
            for (int i = 1; i <=50 ; i+=3) {
                System.out.print(i+" ");
            }
            System.out.println();
        }




}

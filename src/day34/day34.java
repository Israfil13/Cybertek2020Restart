package day34;

public class day34 {
    public static void main(String[] args) {
////    int num1,num2,num3;
////    num1=3;
////    num2=7;
////    num3=6;
////    int number=num1*100+num2*10+num3;
//        System.out.println(number);
        int result1= build3digitnumber(6,41,0);
        System.out.println("result1 = " + result1);
        int result2= build3digitnumber(6,4,0);
        System.out.println("result2 = " + result2);
        System.out.println("result1 +result2 = " + (result2+result1));
        System.out.println(result2+result1+" is result of result1+result2");


    }

    public static int build3digitnumber(int num1,int num2,int num3){
       if (num1>9 || num1<0){
           num1=0;
       }
        if (num2>9 || num2<0){
            num2=0;
        }
        if (num3>9 || num3<0){
            num3=0;
        }



        int number=num1*100+num2*10+num3;
        return number;


    }



}

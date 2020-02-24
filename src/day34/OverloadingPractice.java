package day34;

public class OverloadingPractice {
    public static void main(String[] args) {
        add(12);
        add(12,5);
        add(12,5,6);
        add(12L,15L);

    }

        public static void add (int num){
            System.out.println(num+100);
        }
     public static void add (int num1,int num2){
//        System.out.println(num1+num2);
         System.out.println(Math.addExact(num1,num2));
    }
    public static void add (int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    public static void add (long num1,long num2){
        System.out.println(num1+num2);

    }



}

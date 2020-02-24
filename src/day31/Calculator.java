package day31;

public class Calculator {
    public static void main(String[] args) {
        add(6,23);
        add(5,10);
        add(1,9);
        add3numbers(5,9,15);
        add3numbers(44,13,15);

    }

    public static void add(int num1, int num2){
        System.out.println("adition result:" + (num1+num2));

    }

    public  static void add3numbers(int num1,int num2,int num3){
        System.out.println("adition result:" + (num1+num2+num3));
    }





}

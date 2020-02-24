package aRepl_Practice;

import java.util.Scanner;

public class Num162_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

//    public static void fib(int num) {
//        int first = 0;
//        int second = 1;
//        int sum = 1;
//        for (int i = 2; i < num; i++) {
//            sum = first + second;
//            first = second;
//            second = sum;
//
//
//        }
//        System.out.println(sum);
//
//    }

    public static void fib(int num) {
        int array[] = new int[num + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= num; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(array[num]);

    }


}





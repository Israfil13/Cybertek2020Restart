package day26;

import day22.Array;

import java.util.Arrays;

public class ReverseWithSwapping {
    public static void main(String[] args) {
        int[]numbers={3,21,2,1,13,8,11,66,2121,8898,85,44};
        int size=numbers.length;
        int lastindex=size-1;
        int middleindex=size/2;
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]+"---"+numbers[lastindex-0]);
        System.out.println(numbers[1]+"---"+numbers[lastindex-1]);
        System.out.println(numbers[2]+"---"+numbers[lastindex-2]);

        for (int i = 0; i <middleindex ; i++) {
            System.out.println(numbers[i]+"---"+numbers[lastindex-i]);
            int temp=numbers[i];
            numbers[i]= numbers [lastindex-i];
            numbers[lastindex-i]=temp;
        }
        System.out.println(Arrays.toString(numbers));




    }
}

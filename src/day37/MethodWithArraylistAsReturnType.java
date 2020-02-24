package day37;

import day22.Array;

import java.util.ArrayList;

public class MethodWithArraylistAsReturnType {
    public static void main(String[] args) {

       int finalnumber=5;
        System.out.println(finalNumber(finalnumber));

      ArrayList<Integer> list=(finalNumber(10));
        System.out.println(list);


    }

    public static ArrayList<Integer> finalNumber(int num ){
        ArrayList<Integer>nums=new ArrayList<>();

        for (int i =1 ; i <=num ; i++) {
            nums.add(i);
        }
        return nums;
    }






}

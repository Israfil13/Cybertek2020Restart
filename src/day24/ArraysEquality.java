package day24;

import day22.Array;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[]scores1={2,5,44,8,9};
        int[]scores2={23,5,4,2,88};
        int[]scores3={2,5,44,8,9};

        boolean isSc1Sc2Equals= Arrays.equals(scores1,scores2);
        System.out.println("is scores 1 and scores 2 equal " + isSc1Sc2Equals);

        boolean isSc1Sc3Equals= Arrays.equals(scores1,scores3);
        System.out.println("is scores 1 and scores 3 equal " + isSc1Sc3Equals);





    }
}

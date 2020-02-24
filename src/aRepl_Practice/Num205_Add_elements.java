package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num205_Add_elements {
    public static void main(String[] args) {
       int [] nums1={10, 40, 50, 3, 1};
       int [] nums2={11, 0, 2, 30, 11};

        System.out.println(Arrays.toString(addElements(nums1,nums2)));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] ints3= new int[5];
        for (int i = 0; i <ints3.length ; i++) {
            ints3[i]=ints1[i]+ints2[i];
        }
        return ints3;

    }
}

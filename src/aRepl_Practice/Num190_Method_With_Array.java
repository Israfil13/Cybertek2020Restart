package aRepl_Practice;

import java.util.Arrays;

public class Num190_Method_With_Array {
    public static void main(String[] args) {
        int [ ] a={1,2,3};
        int [ ] b={5,8,9};
        System.out.println(Arrays.toString(mergR(a,b)));

    }
    public static int[] mergR(int[] a,int[] b) {
        int lenght=a.length+b.length;
        int [] merge=new int[lenght];
        int z=0;
        for (int i = 0; i <a.length; i++) {
            merge[z]=a[i];
            z++;
        }
        for (int i = 0; i <b.length; i++) {
            merge[z]=b[i];
            z++;
        }
        return merge;

    }
}

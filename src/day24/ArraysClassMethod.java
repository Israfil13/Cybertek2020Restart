package day24;

import day22.Array;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        String[] superHeros={"Superman","Batman","WM","Aquaman","Cyborg"};
        System.out.println(Arrays.toString(superHeros));
        String savinSuper=Arrays.toString(superHeros);
        System.out.println(savinSuper.charAt(1));



        int [] nums={1,2,55,63,4};
        System.out.println(Arrays.toString(nums));


        double[] num={41.2,10.23,7.5};
       String numm=Arrays.toString(num);
        for (int i = 0; i <numm.length() ; i++) {
            System.out.println(numm.charAt(i));
        }


    }
}

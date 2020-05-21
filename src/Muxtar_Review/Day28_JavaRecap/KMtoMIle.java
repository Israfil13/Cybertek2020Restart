package Muxtar_Review.Day28_JavaRecap;

import day22.Array;

import java.util.Arrays;

public class KMtoMIle {
    public static void main(String[] args) {
        System.out.println(kmtomile(5));
        gallontolitter(3);
        desending(new int[]{4, 8, 9});
    }

    public static double kmtomile(double km){

        double mile=km*0.612;

        return mile;

    }

    public static void gallontolitter(double gallons){
        double litr=gallons*3.75;
        System.out.println(litr);
    }

    public static void desending(int [] arr){
        Arrays.sort(arr);
        int[] desen=new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            desen[i]=arr[i];
        }

        System.out.println(Arrays.toString(desen));
    }
}

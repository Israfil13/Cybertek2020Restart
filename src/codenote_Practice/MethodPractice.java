package codenote_Practice;

import java.util.Arrays;

public class MethodPractice {
    public static void main(String[] args) {

        galonlitr(4);
        kmmile(5);
        int[] arr = {2, 5, 8, 1, 0, 9};
        decsending(arr);

    }


    public static void kmmile(double km) {
        double mile = 0;
        mile = km * 0.612;
        System.out.println(mile + " ml");
    }

    public static void galonlitr(double gallon) {
        double litr = 0;
        litr = gallon * 3.75;
        System.out.println(litr + " litr");
    }

    public static void decsending(int[] arr) {


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}

package day30;

import java.util.Arrays;

public class SplittANdDefineSize {
    public static void main(String[] args) {
        String sentence="I love Java Java Java";
        String []  splitted =sentence.split(" ",2);
        System.out.println("splitted = " + Arrays.toString(splitted));


    }
}

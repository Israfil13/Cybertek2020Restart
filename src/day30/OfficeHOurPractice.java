package day30;

import java.util.Arrays;

public class OfficeHOurPractice {
    public static void main(String[] args) {

    String str1="abc",str2="cbb";

    char[] ar1=str1.toCharArray();
        Arrays.sort(ar1);;

        char[] ar2=str2.toCharArray();
        Arrays.sort(ar2);

        System.out.println( Arrays.equals(ar1,ar2) );
        str1=Arrays.toString(ar1);
        str2=Arrays.toString(ar2);

        System.out.println(str1.equals(str2));
    }
}

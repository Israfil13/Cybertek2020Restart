package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero="Superman-Clark Kent";
        String [] arrayhero=hero.split("-");
        System.out.println(Arrays.toString(arrayhero));
        String fullname=arrayhero[1];
        String splittedfullname[]=fullname.split(" ");
        System.out.println(splittedfullname[0].charAt(0)+" "+splittedfullname[1].charAt(0));
//        System.out.println(fullname.charAt(0)+" "+fullname.charAt(fullname));


    }
}

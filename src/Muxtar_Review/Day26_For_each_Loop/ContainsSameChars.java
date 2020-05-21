package Muxtar_Review.Day26_For_each_Loop;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ContainsSameChars {
    public static void main(String[] args) {
        String str1="aabbbc";
        String str2="abc";

    }
    public static boolean samechar(String str1,String str2){
        str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        if (str1.equals(str2)){
            return true;
        }else return false;

    }

}

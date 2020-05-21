package Muxtar_Review.Day30_Wrapping;

import java.util.Arrays;
import java.util.HashSet;

public class Nondup {
    public static void main(String[] args) {
        System.out.println(nondup("aaabbbbcccc"));
        System.out.println(findunique("aaaabccdfff"));

    }

    public static String nondup(String str){
        String nondup="";

        for (int i = 0; i <str.length() ; i++) {
            if (!nondup.contains(""+str.charAt(i))){
                nondup+=""+str.charAt(i);
            }
        }
        return nondup;
    }


    public static String findunique(String str){
        String [] strarr=str.split("");
        HashSet<String> uni=new HashSet<>(Arrays.asList(strarr));
        String unique=uni.toString();
        return unique;
    }



}

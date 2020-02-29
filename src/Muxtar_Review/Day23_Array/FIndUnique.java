package Muxtar_Review.Day23_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIndUnique {
    public static void main(String[] args) {
        String str="AAABCDEEDD";
       String unique="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            if (count==1){
                unique+=str.charAt(i)+", ";
            }

        }

        Set<String> strset=new HashSet<>(Arrays.asList(str.split("")));
//        strset.add(str);

        System.out.println("strset = " + strset);

        System.out.println(unique);

        System.out.println(unique);

    }

    public static String unique (String str){
       String unique="";
        for (int i = 0; i <str.length() ; i++) {
       int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    ++count;
                }
            }
            if (count==1){
               unique+=str.charAt(i);
            }
        }
        return unique;
    }
}

package Muxtar_Review.Day30_Wrapping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findunique2("aaaabccdfff"));
    }



    public static String findunique2(String str){
        String unique="";
        for (int i = 0; i <str.length(); i++) {
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

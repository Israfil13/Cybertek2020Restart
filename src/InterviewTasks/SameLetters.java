package InterviewTasks;

import day22.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    public static void main(String[] args) {
        String a= "abc";
        String b= "cab";

        System.out.println(sameletter(a, b));

    }



    public  static boolean sameletter(String a,String b){
       int count=0;
        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <b.length() ; j++) {
                if (a.charAt(i)==b.charAt(j)){
                    count++;
                }
            }
        }

        if (a.length()==count){
            return true;
        }

        return false;
    }

    public static boolean samelet(String a,String b){
        String str1=new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        String str2=new TreeSet<String>(Arrays.asList(b.split(""))).toString();

        return a.equals(b);
    }
}

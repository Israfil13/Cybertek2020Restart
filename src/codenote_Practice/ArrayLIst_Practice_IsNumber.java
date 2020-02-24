package codenote_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIst_Practice_IsNumber {
    public static void main(String[] args) {
        System.out.println(IsNUmber("12331313f1"));
       ArrayList<String> mylist = new ArrayList<>();
//       mylist.add("567522");
       mylist.add("7");
       mylist.add("8");
       mylist.add("0");
       mylist.add("8");
       mylist.add("9j");

       System.out.println(IsNUmberList(mylist));
    }

    public static boolean IsNUmber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                ++count;
            }

        }  if (count == str.length()) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean IsNUmberList(ArrayList<String> mylist){
        String str="";
        for (String each:mylist){
            str+=each;
        }
        return IsNUmber(str);


    }





    }




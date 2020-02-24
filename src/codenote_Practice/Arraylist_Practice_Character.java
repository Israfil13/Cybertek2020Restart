package codenote_Practice;

import day22.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_Practice_Character {
    public static void main(String[] args) {
        System.out.println(Char("Cybertek"));
        List<Character> result=Char2("Cybertek");
       result.add('Z');
        System.out.println(result);

    }

    public static List<Character> Char (String str){
            char [] charstr=str.toCharArray();
        ArrayList<Character>myist=new ArrayList<>();
           for (char each:charstr){
               myist.add(each);
            }
       return myist;
    }
    public static List<Character> Char2 (String str){
        ArrayList<Character>myist=new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            myist.add(str.charAt(i));
        }

        return myist;

    }





}

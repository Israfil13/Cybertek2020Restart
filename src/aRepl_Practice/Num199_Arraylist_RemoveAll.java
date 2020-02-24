package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num199_Arraylist_RemoveAll {
    public static void main(String[] args) {

    }

 public static void removeAll (ArrayList<String> wordList,String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
     System.out.println(wordList);

 }



}

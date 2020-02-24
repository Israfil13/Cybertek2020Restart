package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num198_ArrayList_CombineAll {
    public static void main(String[] args) {
        ArrayList<String> wordList1=new ArrayList<>(Arrays.asList("as","sas"));
        ArrayList<String> wordList2=new ArrayList<>(Arrays.asList("ss","sss"));

        System.out.println(combinall(wordList1,wordList2));
    }
public static ArrayList<String> combinall(ArrayList<String> wordList1,ArrayList<String> wordList2){
    ArrayList<String>worslist3=new ArrayList<>();
        worslist3.addAll(wordList1 ) ;
         worslist3.addAll(wordList2);
    return worslist3;
}
}

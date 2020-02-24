package day37;

import java.util.ArrayList;
import java.util.List;

public class FindLongestName {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Azerbaijan");
        words.add("Italy");
        words.add("Russia");
        words.add("Germany");
        words.add("England");
        words.add("Azerbaijan");

     String longest="";
        for (String each:words){
            if (each.length()>longest.length()){
                longest=each;
            }
        }
        System.out.println(longest);
        for (String eachword:words){
            if (longest.length()==eachword.length()){
                longest+=" "+eachword;
            }
        }

        System.out.println("longest = " + longest);


    }
}

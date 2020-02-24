package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
        String sentece="We are typing to find longest word";
        String[] allword=sentece.split(" ");
        System.out.println("allwords = "+ Arrays.toString(allword));
        String longestword=allword[0];
        int maxcharcount=0;

        for (String currentword:allword) {
            if (longestword.length()<currentword.length()){
                longestword=currentword;
            }
        }
        System.out.println(longestword);

        String sentence="I wil achieve this";
        String[] splittedwords=sentence.split(" ");
        String longest="";
        for (int i = 0; i < splittedwords.length; i++) {
            if (longest.length()<splittedwords.length)
                longest=splittedwords[i];

        }
        System.out.println(longest);



    }
}

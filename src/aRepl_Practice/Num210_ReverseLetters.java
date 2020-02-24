package aRepl_Practice;

import jdk.jshell.execution.Util;

public class Num210_ReverseLetters {
    public static void main(String[] args) {
//        String result = Util.rever("..zxcv..d");
//        System.out.println(result.equals("..dvcx..z")); //true
//
//        String result2 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result2.equals("---olkmb.a-")); //true
//
//        String result3 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result3.equals("-o.lkmba---")); //false
    }

    public static String reverseLetters(String word){
        for (int i = 0; i <word.length()/2 ; i++) {
            if (Character.isLetter(word.charAt(i))){
                char temp=word.charAt(i);
                if (Character.isLetter(word.length()-i-1)) {
//                  word.charAt(i) = word.charAt(word.length()-1-i);


                }

            }
        }



        return word;
    }
}

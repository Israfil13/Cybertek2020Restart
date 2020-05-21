package InterviewTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Polindrom {

    public static boolean checkifPalindrome(String s){

        for (int i = 0; i <s.length()/2 ; i++) {

            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static String longestPalindrom(String s){
        String result="";
       s=s.replace(" ","");

        for (int i = 0; i <s.length() ; i++) {
            for (int j = i; j <s.length() ; j++) {
                if (checkifPalindrome(s.substring(i,j+1))){
                    if (s.substring(i,j+1).length()>result.length()){
                        result=s.substring(i,j+1);
                    }
                }
            }
        }


        return result;
    }

    public static Boolean polindrome(String str){
        String reversed="";
        str=str.replace(" ","");

        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=""+str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversed)){
            return true;
            }
        return false;
    }


    public static boolean isPalindrome3(String s) {
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome3(s.substring(1, s.length() - 1));
    }

    public static  boolean containsUnique(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String t : list) {
            if (!set.add(t))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrom("babda"));

        System.out.println(isPalindrome3("zobboz"));

        System.out.println(polindrome("anna"));
        List<String> list= Arrays.asList("a","b","a","d","g","d");
        System.out.println(containsUnique(list));
    }
}


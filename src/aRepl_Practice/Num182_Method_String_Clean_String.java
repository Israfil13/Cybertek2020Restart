package aRepl_Practice;

import java.util.ArrayList;
import java.util.List;

public class Num182_Method_String_Clean_String {
    public static void main(String[] args) {
        System.out.println(clean("foo bar","bar"));
    }
    public static String clean (String text ,String badWord) {


return text.replace(badWord,"");

    }
}

package day20;

import day14.StringReview;

public class WorkingWithMoreRhanOneCharinString {
    public static void main(String[] args) {

        String name= "Gokyuzum";
        int charCount=name.length();

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));
////        int x=0;
////        System.out.println(name.substring(x,x+2));
////        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));

        for (int x = 0; x <= name.length()-2; x+=2) {
            System.out.println(name.substring(x,x+2));
        }
        String tag="a";
        String word="aaaaaa";

        System.out.println("<"+tag+">"+word+"</"+tag+">");
        System.out.println(word.substring(word.length()-2) );
    }
}

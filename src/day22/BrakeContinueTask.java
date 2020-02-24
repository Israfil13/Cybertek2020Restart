package day22;

import org.w3c.dom.ls.LSOutput;

public class BrakeContinueTask {
    public static void main(String[] args) {

        String sentence="I struggle with Java I like Java I love Java Everything is awesome";
//        for (int i = 0; i <=sentence.length()-1 ; i++) {
//            if (i%2==1){
//            continue;
//
//            }   System.out.print(sentence.charAt(i));
//
//
//        }
//        System.out.println();
//        for (int i = 0; i <=sentence.length()-1 ; i++) {
//            if (sentence.substring(i,i+1).equalsIgnoreCase("a")){
//                break;
//            }
//            System.out.print(sentence.charAt(i));
        for (int i = 0; i <=sentence.length()-1 ; i++) {
            if (i%2==1){
                continue;}

                    if (sentence.substring(i,i+1).equalsIgnoreCase("j")){
                        break;
                    }
                    System.out.print(sentence.charAt(i));


        }












        }


    }


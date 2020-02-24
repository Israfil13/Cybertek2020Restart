package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String sentence="I love Java" ;
       String[] allwords=sentence.split(" ");
        System.out.println(Arrays.toString(allwords));
        System.out.println(allwords.length);
        System.out.println(allwords[allwords.length-1]);


        String sentece2="Everything is Awesome !!!";
        String[] splitbyeArr=sentece2.split("e");
        System.out.println(Arrays.toString(splitbyeArr));

        for(String eachpiece:splitbyeArr){
            System.out.println(eachpiece);

        }


        String[] splitbyeis=sentece2.split("is");
        for (String eacjpiece:splitbyeis){

        }   System.out.println(Arrays.toString(splitbyeis));


         String sentece3="I fucking will do it";
         String [] splitbyi=sentece3.split("i");
         for (String eachpart:splitbyi){
             System.out.println(eachpart);
         }             System.out.println(Arrays.toString(splitbyi));




    }
}

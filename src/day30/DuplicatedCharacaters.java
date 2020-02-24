package day30;

import java.util.Arrays;

public class DuplicatedCharacaters {
    public static void main(String[] args) {
        String s1="aaabbaaccbbdd";
        String s2="";
        for (int i = 0; i <s1.length(); i++) {
            String eachchar=s1.charAt(i)+"";
           if (!s2.contains(eachchar))

            s2+=eachchar;

        }
        System.out.println(s2);
        String result="";
        String fiveMin="abcabcdeedddeeefffffjjjj";
       String[] eachchar=fiveMin.split("");
       for (String each:eachchar){
           if (!result.contains(each)){
               result+=each;
           }
       }
        System.out.println(result);



//        3. given the array of names:
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        write a program that can remove all the names named Ahmed from the array
//        Ex:
//        names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        System.out.println( Arrays.toString(names) );
//        output:
//	   			[John, Eric, Hassan]
//
        String noAhmed="";
//        String name= Arrays.toString(names);
//        String [] namesarr=name.split("Ahmed");

        for (String each:names){
            if (!each.contains("Ahmed")){
                noAhmed+=each+" ";
            }
        }
        System.out.println("noAhmed = " + noAhmed);
        String noAhmedarr [] =noAhmed.split(" ");
        System.out.println("noAhmed = "+ Arrays.toString(noAhmedarr));










    }
}

package day25;

import java.util.Arrays;

public class StringtoCharArryaMetod {
    public static void main(String[] args) {
//        String name="Alesya";
//        char [] nameChar=new char[name.length()];
//        for (int i = 0; i <name.length() ; i++) {
//            nameChar[i]=name.charAt(i);
//        }
//        System.out.println("NamesChars" + Arrays.toString(nameChar));
//
//
//        String name1="Israfil";
//        char[] name1char=name1.toCharArray();
//      int acharcount=0;
//       for(char eachchar:name1char){
//          if(eachchar=='a')
//                     ++acharcount;
//       }
//        System.out.println("My name like char " + Arrays.toString(name1char));
//        System.out.println("acharcount = " + acharcount);
//        Arrays.sort(name1char);
//        System.out.println(Arrays.toString(name1char));



        String namee="Sohrab";
        char [] nameechar=namee.toCharArray();
        System.out.println(Arrays.toString(nameechar));

        char[] caarNamee= new char[namee.length()];
        for (int i = 0; i <namee.length() ; i++) {
         caarNamee[i]=namee.charAt(i)   ;
        }System.out.println(Arrays.toString(caarNamee));







    }
}

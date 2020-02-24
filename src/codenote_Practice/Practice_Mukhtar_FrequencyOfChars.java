package codenote_Practice;

import java.util.Arrays;

public class Practice_Mukhtar_FrequencyOfChars {
    public static void main(String[] args) {
//        1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
//        Ex:
//        RemoveDuplicate("aaabbbccc") ==> "abc"
//        2. write a return method called Frequency that accepts String and  char, the method will return the total number of ocuurence of the given char in the given string
//        Ex:
//        Frequency("AAABBB", 'A') ==> 3
//        3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
//        Ex:
//        FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
String str="aaabbbccc";
String aaa="AAABBB";
char a='A';
   RemoveDup(str);
   Frequency(aaa,a);
        System.out.println(FrequencyofChars(str));

    }
    public static String RemoveDup(String str){

        String resul="";
        for (int i = 0; i < str.length() - 1; i++) {
            if (!resul.contains(""+str.charAt(i))){
                resul+=str.charAt(i);
            }

        }
        return resul;


        //               String [] strarr=str.split("");
//      String non="";
//        String [] nondup=new String[strarr.length];
//        for (int i = 0; i <strarr.length-1 ; i++) {
//            if (strarr[i]!=strarr[i]+1){
//               non+=String.valueOf(strarr[i]);
//            }
//        }
//        System.out.println(non);

    }

    public static int Frequency(String str, char a){
        int count=0;
//        String [] arr=str.split("");
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==a){
                ++count;
            }

        }
      return count;
    }
    public static String  FrequencyofChars(String str) {
       String result="";
        String nondup=RemoveDup(str);
        for (int i = 0; i <nondup.length() ; i++) {
            int count=  Frequency(str,nondup.charAt(i));
            result+=""+nondup.charAt(i)+count;
        }
    return result;
    }

}

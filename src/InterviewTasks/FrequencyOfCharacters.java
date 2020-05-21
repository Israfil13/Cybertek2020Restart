package InterviewTasks;

import day22.Array;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AACABBDBCCACDDD";

//        System.out.println(charfreq(str));
        System.out.println(freqchar(str));
    }

    public static   String charfreq (String str){
      String nondup="";
      String freq="";
        for (int i = 0; i <str.length() ; i++) {
            if (!nondup.contains(""+str.charAt(i))){
                nondup+=str.charAt(i);
            }
        }

        for (int i = 0; i <nondup.length() ; i++) {
           int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (nondup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            freq+=""+nondup.charAt(i)+count;

        }
        return freq;
    }


    public static Map<Character,Integer> freqchar(String str2){
        Map<Character,Integer> freqchar=new HashMap<>();
        for (int i = 0; i <str2.length() ; i++) {
            if (!freqchar.containsKey(str2.charAt(i))){
                freqchar.put(str2.charAt(i),1);{
                }
            }else {
                freqchar.replace(str2.charAt(i), freqchar.get(str2.charAt(i))+1);
            }

        }

        return freqchar;
    }




}

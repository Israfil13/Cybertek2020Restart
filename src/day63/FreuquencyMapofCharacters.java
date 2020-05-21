package day63;

import java.util.HashMap;
import java.util.Map;

public class FreuquencyMapofCharacters {
    public static void main(String[] args) {

        String stttr="AAAABBBBBCCDDD";

        Map<Character,Integer> charfreq=new HashMap<>();
        for (int i = 0; i <stttr.length() ; i++) {
            if (!charfreq.containsKey(stttr.charAt(i))){
                charfreq.put(stttr.charAt(i),1);
            }else {
                charfreq.replace(stttr.charAt(i),charfreq.get(stttr.charAt(i))+1);

            }
        }

        System.out.println("charfreq = " + charfreq);


    }
}

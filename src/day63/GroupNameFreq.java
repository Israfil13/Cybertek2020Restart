package day63;

import java.util.*;

public class GroupNameFreq {
    public static void main(String[] args) {

        List<String> group=new ArrayList<>();
        group.addAll(Arrays.asList("Furkan","Daria","Serife","Muge","Alisa","Semra","Huseyin","Fatma","Guvanch","Fatih","Ahmet"+
                "Ayse","Rabiyam","Gulzina"));

        Map<String,Integer> namecharcount=new HashMap<>();
        for (String eachmember:group){
            namecharcount.put(eachmember,eachmember.length());
        }
        System.out.println("namecharcount = " + namecharcount);


    }
}

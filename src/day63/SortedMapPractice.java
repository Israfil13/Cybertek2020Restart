package day63;

import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice {
    public static void main(String[] args) {

        SortedMap<String,Integer> scoreMap=new TreeMap<>();
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        scoreMap.put("Dave",53);
        scoreMap.put("Jack",93);

        System.out.println(scoreMap);
        System.out.println(scoreMap.subMap("Dave","John"));
        System.out.println("scoreMap.headMap(\"Jack\") = " + scoreMap.headMap("Jack"));
        System.out.println(scoreMap.tailMap("Jack"));

        SortedMap<String, Integer> tailview = scoreMap.tailMap("Dave");
    }
}

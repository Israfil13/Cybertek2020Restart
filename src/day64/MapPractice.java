package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, List<String>> groupMap=new HashMap<>();
        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        groupMap.forEach((groupName,members)-> System.out.println("groupName : "+groupName+"\n " + "members "+members));

        System.out.println(groupMap.get("Achievers").get(3));

        System.out.println("groupMap.containsKey(\"Powerof4\") = " + groupMap.containsKey("Powerof4"));

        System.out.println("groupMap.get(\"BugHunter\").contains(\"Gulzina\") = " + groupMap.get("BugHunter").contains("Gulzina"));

        groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Superman","Batman","WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));

    }
}

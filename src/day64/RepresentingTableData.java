package day64;

import java.util.*;

public class RepresentingTableData {
    public static void main(String[] args) {

        Map<String,String> row1= new LinkedHashMap<>();
        row1.put("first_name","Regan");
        row1.put("email","rboichat0@1688.com");
        row1.put("gender","Female");

        Map<String,String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Female" );

        List<Map<String,String>> maplist=new ArrayList<>(Arrays.asList(row1,row2));
        System.out.println(maplist);
        maplist.get(1).get("first_name");

        maplist.get(0).replace("firstf_name","Hulk");

        System.out.println("maplist = " + maplist);


    }
}

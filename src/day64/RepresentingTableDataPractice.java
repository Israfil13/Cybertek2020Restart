package day64;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.LinkedHashMap;

public class RepresentingTableDataPractice {
    public static void main(String[] args)throws Exception {


        List<String> allinfo= Files.readAllLines(Paths.get("src/day64/info.txt"));

//        allinfo.forEach(each-> System.out.println("each = " + each));

//        String [] infoarr=allinfo.get(1).split(",");

//        Map<String,String> row1=new LinkedHashMap<>();
//        row1.put("name",infoarr[0]);
//        row1.put("email",infoarr[1]);
//        row1.put("gender",infoarr[2]);

        List<  Map<String,String>> rowMaplist=new ArrayList<>();
        for (int i = 0; i <allinfo.size() ; i++) {
            Map<String,String> row =new LinkedHashMap<>();
            String [] infoarr=allinfo.get(i).split(",");
            row.put("name",infoarr[0]);
            row.put("email",infoarr[1]);
            row.put("gender",infoarr[2]);
            rowMaplist.add(row);
        }

        rowMaplist.forEach(eachInfo-> System.out.println("eachInfo = " + eachInfo));

//        System.out.println("row1 = " + row1);
    }
}

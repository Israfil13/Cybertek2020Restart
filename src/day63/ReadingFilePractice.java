package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args)throws Exception {

        List<String> alldata= Files.readAllLines(Paths.get("src/day63/employeeData.txt"));
        Map<Integer,String> idNamePair = new HashMap<>();

        for (String eachline:alldata){

            int id=Integer.parseInt(eachline.split(",")[0]);
            String name=eachline.split(",")[1];
//            System.out.println("id = " + id);
//            System.out.println("name = " + name);
            idNamePair.put(id,name);

        }

        System.out.println("idNamePair = " + idNamePair);
        System.out.println("idNamePair.get(5) = " + idNamePair.get(5));

//        alldata.forEach(each-> System.out.println(each));







    }
}

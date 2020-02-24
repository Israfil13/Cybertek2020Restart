package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyFromFile {
    public static void main(String[] args) {


        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day63/map.txt"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString = allLines.toString();


            Map<String, Integer> map = WordFrequencyMethod.getFrequencyMap(allLinesAsString);
            System.out.println("map.txt = " + map);


        } catch (IOException e) {
            System.out.println("ERROR@@@!!!!!");
        }


    }
}

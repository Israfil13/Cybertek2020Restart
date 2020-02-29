package day64;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new java.util.LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // for LinkedHashMap
//        {Tomato=1.99, Patato=2.99, Grape=3.99, Banana=1.99, Apple=1.89}
        // for HashMap
        // {Apple=1.89, Grape=3.99, Patato=2.99, Tomato=1.99, Banana=1.99}
    }
    }


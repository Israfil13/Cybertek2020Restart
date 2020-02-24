package day63;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.HashMap;
import java.util.Map;

public class GrouceryMap {
    public static void main(String[] args) {
        Map<String,Double> grocery=new HashMap<>();
        grocery.put("Apple",2.49);
        grocery.put("Tomato",2.9);
        grocery.put("Potato",2.9);
        grocery.put("Oil",4.8);
        grocery.put("Oil",4.8);
        grocery.put("Butter",2.59);
        grocery.put("Water",4.25);
        grocery.put("Banana",0.49);

        grocery.putIfAbsent("Butter",2.6);
        System.out.println("grocery = " + grocery);
        System.out.println("grocery.get(\"Potato\") = " + grocery.get("Potato"));
        grocery.replace("Apple",2.49*2);
        grocery.replace("Banana",grocery.get("Banana")*2);
        if (grocery.containsKey("Tomato")){
            grocery.remove("Tomato");
            System.out.println("No more tamoto");
        }

        System.out.println("grocery = " + grocery);






    }
}

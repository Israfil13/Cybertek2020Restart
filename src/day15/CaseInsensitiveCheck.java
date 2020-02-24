package day15;

import java.sql.SQLOutput;

public class CaseInsensitiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println("name contains \"st\" + Results is " + name.contains("st"));
        String lowname=name.toLowerCase();
        System.out.println("lowname contains st or not ? " + lowname.contains("st"));

        System.out.println(name.toUpperCase().contains("ST"));
     //   System.out.println(name.length().);

    }
}

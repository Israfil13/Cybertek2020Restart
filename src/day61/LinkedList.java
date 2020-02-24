package day61;

import day38.LIstObjectEqualityCheck;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> lst= new java.util.LinkedList<>();
        lst.add("Israfil");
        lst.add("Kamran");
        lst.add("Hasan");
        lst.add("Rauf");
        System.out.println("lst = " + lst);
        lst.remove("Rauf");
        System.out.println(lst);

    }
}

package day37;

import java.util.ArrayList;

public class asdsda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Suso");
        names.add("Ibrahimovic");
        names.add("Chalhanoglu");
        names.add("A");
        names.add("Conti");
        names.add("Bennacer");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < 2) {
                names.remove(i);
            } else if (names.get(i).length() > 10) {
                names.set(i, names.get(i).substring(0, 10));

            } else if (names.get(i).length() == 5) {
                String reverse = "";
                for (int j = names.get(i).length()-1; j >= 0; j--) {
                    reverse +=names.get(i).charAt(j);
                }
                names.set(i, reverse);
            }

        }
        System.out.println(names);
    }}
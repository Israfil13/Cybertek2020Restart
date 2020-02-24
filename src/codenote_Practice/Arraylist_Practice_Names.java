package codenote_Practice;

import java.util.ArrayList;

public class Arraylist_Practice_Names {
    public static void main(String[] args) {
//        Given List of names with various character count,
//        Remove any name with less than 2 characters
//        and if any name has more than 10 character only keep 10 characters
//        and if it has exactly 5 characters , reverse it
//        Of course , Otionally make a method out of it.
        ArrayList<String> names=new ArrayList<>();
        names.add("Suso");
        names.add("Ibrahimovic");
        names.add("Chalhanoglu");
        names.add("A");
        names.add("Conti");
        names.add("Bennacer");
        System.out.println(checNames(names));



    }

    public static ArrayList<String> checNames (ArrayList<String> names){
//        ArrayList<String> names2=new ArrayList<>();


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



        return names;






    }





}

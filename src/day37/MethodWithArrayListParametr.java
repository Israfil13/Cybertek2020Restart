package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParametr {
    public static void main(String[] args) {

        ArrayList<String> str=new ArrayList<>();
        str.add("Koko");
        str.add("Momo");
        str.add("Zozo");

        printAlist(str);


    }





        public static void  printAlist(ArrayList<String>list) {

        for (String each:list){
            System.out.println("each = " + each);
        }
        }


}



